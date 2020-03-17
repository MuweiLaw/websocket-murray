//package com.murray.websocketmurray.generator.mapper;
//
//
//import java.io.Serializable;
//
///**
// * @description: 通用IMapper<M, ID>
// * M: 实体类
// * E: Example
// * ID:主键的变量类型
// * @date: 2020-02-13 15:49:20
// */
//public interface IMapper<M, ID extends Serializable> {
//    /**
//     * 根据ID删除
//     *
//     * @param id 主键ID
//     * @return 返回删除成功的数量
//     */
//    int deleteByPrimaryKey(ID id);
//
//    /**
//     * 添加对象所有字段
//     *
//     * @param record 插入字段对象(必须含ID）
//     * @return 返回添加成功的数量
//     */
//    int insert(M record);
//
//
//    /**
//     * 根据ID查询
//     *
//     * @param id 主键ID
//     * @return 返回查询的结果
//     */
//    M selectByPrimaryKey(ID id);
//
//
//    /**
//     * 根据ID修改所有字段(必须含ID）
//     *
//     * @param record 修改字段对象(必须含ID）
//     * @return 返回更新成功的数量
//     */
//    int updateByPrimaryKey(M record);
//
//}