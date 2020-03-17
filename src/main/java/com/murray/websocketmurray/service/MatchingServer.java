package com.murray.websocketmurray.service;

import com.dc.codelegend.domain.QuestionOnline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Description:
 * @author: Murray Law
 * @Date:2020/3/12 18:58
 */
@Service("matching")
public class MatchingServer extends BaseServer {
    @Autowired
    private QuestionOnlineServer questionOnlineServer;

    //匹配用户
    @Transactional
    public void matching(QuestionOnline dataInfo, Map ws) {//当前用户在线信息,长链接对象
        QuestionOnline matchingDataInfo;
        List<QuestionOnline> roomDataInfo=new ArrayList<>();

        //如果有我在线的记录
        if (null != dataInfo.getMemberId()) {
            //验证是否是手动匹配
            if (dataInfo.getType() == 1) {//1自动匹配,注意段位必须要有否则匹配不到
                Jedis redis = new Jedis();
                //所有刚上线的用户添加到添加到队列
                redis.rpush("redis_send_member_id", String.valueOf(dataInfo.getMemberId()));
                //再从队列中弹出用户一个一个匹配
                String redisSendMemberId = redis.lpop("redis_send_member_id");
                if (null != redisSendMemberId) {
                    //匹配对象：在线用户(不是自己),并且是没有在pk中的,并且是自动匹配,并且段位相同
                    Map map = new HashMap();
                    map.put("is_online", "1");
                    List<QuestionOnline> questionOnlines = questionOnlineServer.selectByMapOrderByRand(map);//todo
                    if (questionOnlines.size() > 0) {
                        for (QuestionOnline questionOnline : questionOnlines) {
                            while (!questionOnline.getMemberId().equals(redisSendMemberId)
                                    && questionOnline.getType() != 2
                                    && questionOnline.getQuestionDanId().equals(dataInfo.getQuestionDanId())) {
                                matchingDataInfo = questionOnline;
                                break;
                            }
                        }
                    }
                } else {//手动匹配
                    //如果有邀请id
                    if (null != dataInfo.getFxMemberId()) {
                        //检查邀请人是否还在线
                        //is_online 是否在线：1是2否
                        //is_pk 	-1失败pk,1等待pk, 2正在pk, 3完成pk
                        //type 		类型:1自动匹配,2手动邀请匹配
                        Map map = new HashMap();
                        map.put("member_id", String.valueOf(dataInfo.getFxMemberId()));
                        Integer isInvitationOnline;
                        List<QuestionOnline> questionOnlines = questionOnlineServer.selectByMap(map);
                        //去除不符合条件的对象
                        for (QuestionOnline questionOnline : questionOnlines) {
                            while (questionOnline.getMemberId() == dataInfo.getMemberId()
                                    && questionOnline.getIsOnline() != 1
                                    && questionOnline.getIsPk() == 2
                                    && questionOnline.getType() != 2) {
                                questionOnlines.remove(questionOnline);
                            }
                        }
                        isInvitationOnline = questionOnlines.size();
                        //如果邀请人不在线
                        if (null == isInvitationOnline || 0 == isInvitationOnline) {
                            Map postData = new HashMap();
                            //给点击邀请进来的用户提示,当前房间已过期
                            //-5对方不在线,-4返回心跳,-3给对方推送离线消息,-2推送表情,-1给对方与自己推送分数，1为自动匹配成功,2出题成功,3出答案成功,4最后出结果
                            postData.put("push_type", 5);
                            postData.put("member_id", dataInfo.getFxMemberId());
                            //给点击邀请进来的用户提示
                            if (null != dataInfo.getFd()) {
                                ws.put(dataInfo.getFd(), this.msg(1, "您是被邀请进来,但是发启人已不在线,不可以对战", postData.toString()));
                            } else {
                                //匹配对象：在线用户(不是自己),并且是没有在pk中的,并且是手动匹配,并且等于分享的人
                                Map map1 = new HashMap();
                                map.put("is_online", "1");
                                List<QuestionOnline> questionOnlines1 = questionOnlineServer.selectByMap(map1);
                                for (QuestionOnline questionOnline : questionOnlines1) {
                                    while (questionOnline.getMemberId() != dataInfo.getMemberId()
                                            && questionOnline.getIsPk() != 2
                                            && questionOnline.getFxMemberId() == dataInfo.getFxMemberId()
                                    ) {
                                        matchingDataInfo = questionOnline;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
