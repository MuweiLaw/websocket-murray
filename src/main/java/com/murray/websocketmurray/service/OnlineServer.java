package com.murray.websocketmurray.service;

import com.dc.codelegend.domain.QuestionMemberFriend;
import com.dc.codelegend.domain.QuestionOnline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Description: 在线服务
 * @Version 1.0.0
 * @Author Murray Law
 * @Date 2020/3/9 11:56
 */
@Service("onlineServer")
public class OnlineServer extends BaseServer {
    @Autowired
    private QuestionOnlineServer questionOnlineServer;

    @Autowired
    private OnLineRedisServer onLineRedisServer;//注入redis在线记录服务
    @Autowired
    private QuestionMemberFriendServer questionMemberFriendServer;//注入会员好友服务

    public QuestionOnline online(QuestionOnline post) {
        ArrayList<QuestionMemberFriend> friendData = new ArrayList<>();
        //初始化
        QuestionOnline dataInfo = null;
        //先获取
        Long deleteFd = post.getFd();
        //先删除MySQL的数据
        Boolean isOk = questionOnlineServer.deleteByMemberId((Integer) post.getMemberId());
        if (isOk) {
            onLineRedisServer.onlineDelete(post);
        }
        //附加字段
        post.setIsOnline((byte) 1);//是否在线：1是2否
        post.setIsPk((byte) 1);//1失败pk,1等待pk, 2正在pk, 3完成pk
        //获取成功添加的数据
        if (questionOnlineServer.insert(post) > 0) {
            dataInfo = post;
        }
        //如果添加mysql在线用户成功,再添加redis在线用户
        if (null != dataInfo.getQuestionOnlineId()) {
            onLineRedisServer.onlineAdd(post.getMemberId(), dataInfo);
        }
        //查看当前在线redsi人数
        //$a=$OnlineRedis->online();
        //print_r($a);exit;
        //添加好友,必须是手动匹配,并且有分享的id
        if (post.getType() == 2 && post.getFxMemberId() > 0) {
            //合法
            if (post.getFxMemberId() != post.getMemberId()) {
                QuestionMemberFriend questionMemberFriend = new QuestionMemberFriend();
                //验证是否添加过好友记录
                questionMemberFriend.setMemberId(post.getFxMemberId());
                questionMemberFriend.setQuestionMemberFriendId(post.getMemberId());
                int isAdd = questionMemberFriendServer.selectByQuestionMemberFriend(questionMemberFriend).size();
                //好友post,主动
                if (isAdd == 0) {
                    QuestionMemberFriend questionMemberFriendByInitiative = new QuestionMemberFriend();
                    //邀请的会员id  fx_member_id的好友是member_id
                    questionMemberFriendByInitiative.setMemberId(post.getFxMemberId());
                    //被邀请的会员id
                    questionMemberFriendByInitiative.setFriendMemberId(post.getMemberId());
                    //1主动邀请成为好友,2被动邀请成为好友
                    questionMemberFriend.setType((byte) 1);
                    friendData.add(questionMemberFriendByInitiative);

                }
                //验证是否添加过好友记录
                questionMemberFriend.setMemberId(post.getMemberId());
                questionMemberFriend.setQuestionMemberFriendId(post.getFxMemberId());
                isAdd = questionMemberFriendServer.selectByQuestionMemberFriend(questionMemberFriend).size();
                //好友post,被动
                if (isAdd == 0) {
                    QuestionMemberFriend questionMemberFriendByPassive = new QuestionMemberFriend();
                    questionMemberFriendByPassive.setMemberId(post.getMemberId());
                    questionMemberFriendByPassive.setFriendMemberId(post.getFxMemberId());
                    questionMemberFriendByPassive.setType((byte) 2);
                    friendData.add(questionMemberFriendByPassive);
                }
                if (null != friendData) {
                    questionMemberFriendServer.insertByQuestionMemberFriends(friendData);
                }
            }
        }
        //返回上线数据
        this.msg(1, "上线成功", dataInfo.toString());

        //返回
        return dataInfo;
    }
}
