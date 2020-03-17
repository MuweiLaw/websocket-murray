package com.murray.websocketmurray.controller;

import com.dc.codelegend.domain.QuestionOnline;
import com.dc.codelegend.websocket.service.OnlineServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

@ServerEndpoint(value = "/ws")
@Component
public class WebSocketController {
    @Autowired
    private OnlineServer onlineServer;

    @PostConstruct
    public void init() {
        System.out.println("websocket 加载");
    }

    private static Map<String, Object> ws = new HashMap();
    private static Logger log = LoggerFactory.getLogger(WebSocketController.class);
    private static final AtomicInteger OnlineCount = new AtomicInteger(0);
    // concurrent包的线程安全Set，用来存放每个客户端对应的Session对象。
    private static CopyOnWriteArraySet<Session> SessionSet = new CopyOnWriteArraySet<Session>();

    void setWs() {
        ws.put("daemonize",false);
        ws.put("max_request",500);
        ws.put("dispatch_mode",2);
        ws.put("debug_mode",1);
        ws.put("heartbeat_check_interval",60);
        ws.put("heartbeat_idle_time",600);
        ws.put("reactor_num",4);
        ws.put("worker_num",4);
        ws.put("backlog",128);
        ws.put("log_file","/home/wwwlogs/swoole.log");
    }

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session) {
        SessionSet.add(session);
        //获取Url的参数map
        Map<String, List<String>> params = session.getRequestParameterMap();
        // 在线数加1
        int cnt = OnlineCount.incrementAndGet();
        log.info("有连接加入，当前连接数为：{}", cnt);
        SendMessage(session, "连接成功");
        //获取会员id
        String memberId = params.get("member_id").get(0);
        //是否自动匹配,并且转化成Integer类型
        String type0 = params.get("type").get(0);
        Byte type = (null != type0) ? Byte.valueOf(type0) : 1;
        //分享会员id,只要有值,这个变为手动匹配,并且转化成Integer类型
        String fxMemberId0 = session.getRequestParameterMap().get("fx_member_id").get(0);
        Integer fxMemberId = (null != fxMemberId0) ? Integer.valueOf(fxMemberId0) : 0;
        //段位id,有的话以以段位取内容，没有随机,并且转化成Integer类型
        String questionDanId0 = params.get("question_dan_id").get(0);
        Integer questionDanId = (null != questionDanId0) ? Integer.valueOf(questionDanId0) : 0;
        //获取fd
        Long fd = Long.valueOf(params.get("fd").get(0));
        //检测合法
        if (null != memberId) {
            //初始化
            QuestionOnline post = new QuestionOnline();
            //获取会员id
            post.setMemberId(Integer.valueOf(memberId));
            //获取fd
            post.setFd(fd);
            //是否自动匹配 类型:1自动匹配,2手动邀请匹配
            post.setType(type);
            //获取发起者
            post.setFxMemberId(fxMemberId);
            //获取段位id
            post.setQuestionDanId(questionDanId);
            QuestionOnline dataInfo = onlineServer.online(post);

            //--------匹配在线用户--------------------
            Short isMatchingOk = 2;//是否匹配成功:1是2否

        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(Session session) {
        SessionSet.remove(session);
        int cnt = OnlineCount.decrementAndGet();
        log.info("有连接关闭，当前连接数为：{}", cnt);
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("来自客户端的消息：{}", message);
        SendMessage(session, "收到消息，消息内容：" + message);

    }

    /**
     * 出现错误
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        log.error("发生错误：{}，Session ID： {}", error.getMessage(), session.getId());
        error.printStackTrace();
    }

    /**
     * 发送消息，实践表明，每次浏览器刷新，session会发生变化。
     *
     * @param session
     * @param message
     */
    public static void SendMessage(Session session, String message) {
        try {
            session.getBasicRemote().sendText(String.format("%s (From Server，Session ID=%s)", message, session.getId()));
        } catch (IOException e) {
            log.error("发送消息出错：{}", e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 群发消息
     *
     * @param message
     * @throws IOException
     */
    public static void BroadCastInfo(String message) throws IOException {
        for (Session session : SessionSet) {
            if (session.isOpen()) {
                SendMessage(session, message);
            }
        }
    }

    /**
     * 指定Session发送消息
     *
     * @param sessionId
     * @param message
     * @throws IOException
     */
    public static void SendMessage(String message, String sessionId) throws IOException {
        Session session = null;
        for (Session s : SessionSet) {
            if (s.getId().equals(sessionId)) {
                session = s;
                break;
            }
        }
        if (session != null) {
            SendMessage(session, message);
        } else {
            log.warn("没有找到你指定ID的会话：{}", sessionId);
        }
    }

}