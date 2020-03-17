package com.murray.websocketmurray.service;

import com.dc.codelegend.domain.QuestionMemberFriend;
import com.dc.codelegend.generator.mapper.QuestionMemberFriendIMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: todo
 * @author: Murray Law
 * @Date:2020/3/12 1:10
 */
@Service("questionMemberFriendServer")
public class QuestionMemberFriendServer extends BaseServer {
    @Autowired
    private QuestionMemberFriendIMapper questionMemberFriendIMapper;

    /**
     * @return java.util.List<com.dc.codelegend.domain.QuestionMemberFriend>
     * @Description: 根据QuestionMemberFriend对象来查找
     * @Param []
     * @author Murray Law
     * @date 2020/3/12 1:15
     */
    public List<QuestionMemberFriend> selectByQuestionMemberFriend(QuestionMemberFriend questionMemberFriend) {
        return questionMemberFriendIMapper.selectByQuestionMemberFriend(questionMemberFriend);
    }

    /**
     * @return int
     * @Description: 批量插入服务
     * @Param [questionMemberFriends]
     * @author Murray Law
     * @date 2020/3/12 11:10
     */
    public int insertByQuestionMemberFriends(List<QuestionMemberFriend> questionMemberFriends) {
        return questionMemberFriendIMapper.insertByQuestionMemberFriends(questionMemberFriends);
    }
}
