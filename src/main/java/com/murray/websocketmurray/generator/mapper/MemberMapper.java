package com.murray.websocketmurray.generator.mapper;

import com.murray.websocketmurray.domain.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: 会员mapper
 * @ClassName: MemberMapper
 * @Version:
 * @Author: Murray Law
 * @Date 2020/3/9 11:47
 */
@Mapper
public interface MemberMapper {
    /**
     * 根据ID删除
     *
     * @param MemberId 主键ID
     * @return 返回删除成功的数量
     */
    int deleteByPrimaryKey(Integer MemberId);

    /**
     * 添加对象所有字段
     *
     * @param member 插入字段对象(必须含ID）
     * @return 返回添加成功的数量
     */
    int insert(Member member);


    /**
     * 根据ID查询
     *
     * @param memberId 主键ID
     * @return 返回查询的结果
     */
    Member selectByPrimaryKey(Integer memberId);


    /**
     * 根据ID修改所有字段(必须含ID）
     *
     * @param member 修改字段对象(必须含ID）
     * @return 返回更新成功的数量
     */
    int updateByPrimaryKey(Member member);

}