package com.murray.websocketmurray.generator.mapper;

import com.dc.codelegend.domain.QuestionMemberFriend;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: Todo
 * @author: Murray Law
 * @Date:2020/3/12 1:03
 */
@Repository
public interface QuestionMemberFriendIMapper {
    List<QuestionMemberFriend> selectByQuestionMemberFriend(QuestionMemberFriend questionMemberFriend);

    int insertByQuestionMemberFriends(List<QuestionMemberFriend> questionMemberFriends);
}
