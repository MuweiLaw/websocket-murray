package com.murray.websocketmurray.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @author: Murray Law
 * @Date:2020/3/12 0:58
 */
@Data
public class QuestionMemberFriend implements Serializable {
    private static final long serialVersionUID = 6655659113657368161L;
    private Integer questionMemberFriendId;//主键，自增
    private Integer memberId;//我的会员id
    private Integer friendMemberId;//好友会员id
    private Byte type;//1主动邀请成为好友,2被动邀请成
    private Date createdAt;//创建时间

}
