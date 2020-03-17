package com.murray.websocketmurray.generator.mapper;

import com.dc.codelegend.domain.Question;
import com.dc.codelegend.domain.QuestionCriteria;
import com.dc.common.mapper.IMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author mybatis-generator
 * date:2020/02/15 17:22
 */
@Repository
public interface QuestionIMapper extends IMapper<Question, QuestionCriteria, Integer> {
    /**
     * @return java.util.List<Question>
     * @Description: 根据问题查询
     * @Param [question]
     * @author Murray Law
     * @date 2020/2/18 17:38
     */
    Question selectByQuestion(String question);

    /**
     * @return java.util.List<com.dc.codelegend.domain.Question>
     * @Description: 分页查询列表
     * @Param [page]
     * @author Murray Law
     * @date 2020/2/22 0:18
     */
    List<Question> findPage(@Param("page") Map<String, Object> page);

    /**
     * @return java.lang.Long
     * @Description: 分页查询的条数
     * @Param [page]
     * @author Murray Law
     * @date 2020/2/22 0:18
     */
    Long countByFindPage(@Param("page") Map<String, Object> page);
}