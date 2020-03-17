package com.murray.websocketmurray.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @author:MuweiLaw
 * @Date:2020/3/5 15:22
 */
@Data
public class QuestionOnline implements Serializable {
    private static final long serialVersionUID = -3563492834735713326L;
    private Integer questionOnlineId;
    private Integer memberId;
    private Long fd;
    private Byte isOnline;
    private Byte isPk;
    private Byte type;
    private Integer fxMemberId;
    private Integer questionDanId;
    private Date createdAt;
    private Date updatedAt;
}
