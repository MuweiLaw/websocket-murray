package com.murray.websocketmurray.generator.mapper;

import com.dc.codelegend.domain.QuestionCategory;
import com.dc.codelegend.domain.QuestionCategoryCriteria;
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
public interface QuestionCategoryIMapper extends IMapper<QuestionCategory, QuestionCategoryCriteria, Short> {
    /**
     * @return java.util.List<QuestionCategory>
     * @Description: 根据关键字查询
     * @Param [keywords]
     * @author Murray Law
     * @date 2020/2/18 17:38
     */
    List<QuestionCategory> selectByTitle(String keywords);
    List<QuestionCategory> selectByKeywords(String keywords);
    /**
     *@return java.util.List<com.dc.codelegend.domain.QuestionCategory>
     *@Description: 分页查询列表
     *@Param [page]
     *@author Murray Law
     *@date 2020/2/22 0:18
     */
    List<QuestionCategory> findPage(@Param("page") Map<String, Object> page);
    /**
     *@return java.lang.Long
     *@Description: 分页查询的条数
     *@Param [page]
     *@author Murray Law
     *@date 2020/2/22 0:18
     */
    Long countByFindPage(@Param("page") Map<String, Object> page);

}