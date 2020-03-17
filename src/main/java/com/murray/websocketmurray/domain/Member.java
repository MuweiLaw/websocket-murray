package com.murray.websocketmurray.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: 会员实体类
 * @author:MuweiLaw
 * @Date:2020/3/4 18:52
 */
@Data
public class Member implements Serializable {
    private static final long serialVersionUID = 7224120010189887514L;
    private Integer memberId;
    private String name;
    private String md5Extend;
    private String password;
    private String payPassword;
    private String wechatOpenid;
    private String miniOpenid;
    private String unionId;
    private String nickName;
    private String headerPic;
    private String weChatName;
    private String qqOpenid;
    private String cellPhone;
    private String qq;
    private String email;
    private Byte sex;
    private Date birthday;
    private String address;
    private String diySign;
    private Byte groupId;
    private Byte state;
    private Byte isSubscribe;
    private BigDecimal money;
    private Date createdAt;
    private Date updatedAt;
    private String isInsider;
}
