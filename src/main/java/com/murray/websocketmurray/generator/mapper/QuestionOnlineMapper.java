package com.murray.websocketmurray.generator.mapper;

import com.murray.websocketmurray.domain.QuestionOnline;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: 问题在线mapper
 * @ClassName: QuestionOnlineMapper
 * @Version:  1.0.0
 * @Author: Murray Law
 * @Date 2020/3/9 11:45
 */
@Mapper

public interface QuestionOnlineMapper  {
    /**
     * 根据ID删除
     *
     * @param questionOnlineId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Integer questionOnlineId);

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

}