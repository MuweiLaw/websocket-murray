package com.murray.websocketmurray.generator.mapper;

import com.dc.codelegend.domain.QuestionOnline;
import com.dc.codelegend.domain.QuestionOnlineCriteria;
import com.dc.common.mapper.IMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description: 问题在线mapper
 * @ClassName: QuestionOnlineMapper
 * @Version: 1.0.0
 * @Author: Murray Law
 * @Date 2020/3/9 11:45
 */
@Repository
public interface QuestionOnlineIMapper extends IMapper<QuestionOnline, QuestionOnlineCriteria, Integer> {
    /**
     * 根据ID删除
     *
     * @param questionOnlineId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Integer questionOnlineId);

    /**
     * @return int
     * @Description: 根据会员ID删除 TODO
     * @Param [memberId]
     * @author Murray Law
     * @date 2020/3/11 11:02
     */
    int deleteByMemberId(Integer memberId);

    /**
     * 添加对象所有字段
     *
     * @param questionOnline 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(QuestionOnline questionOnline);


    /**
     * 根据ID查询
     *
     * @param questionOnlineId 主键ID
     * @return 返回查询的结果
     */
    QuestionOnline selectByPrimaryKey(Integer questionOnlineId);


    /**
     * 根据ID修改所有字段(必须含ID）
     *
     * @param questionOnline 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(QuestionOnline questionOnline);

    List<QuestionOnline> selectByMapOrderByRand(Map<String, String> map);

    List<QuestionOnline> selectByMap(Map<String, String> map);
}