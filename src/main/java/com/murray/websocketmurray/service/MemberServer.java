package com.murray.websocketmurray.service;

import com.dc.codelegend.domain.Member;
import com.dc.codelegend.generator.mapper.MemberIMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Description: 会员服务
 * @author: Murray Law
 * @Date:2020/3/9 11:42
 */
@Service("memberServer")
public class MemberServer extends BaseServer {
    @Autowired
    private MemberIMapper memberMapper;

    /**
     * @return int
     * @Description: 插入数据服务
     * @Param [memberId]
     * @author Murray Law
     * @date 2020/3/9 12:24
     */
    public int insert(Member member) {
        return memberMapper.insert(member);
    }

    /**
     * @return int
     * @Description: 根据主键删除
     * @Param [memberId]
     * @author Murray Law
     * @date 2020/3/9 12:26
     */
    public int deleteByPrimaryKey(Integer memberId) {
        return memberMapper.deleteByPrimaryKey(memberId);
    }

    /**
     * @return int
     * @Description: 根据主键更新
     * @Param [member]
     * @author Murray Law
     * @date 2020/3/9 12:27
     */
    public int updateByPrimaryKey(Member member) {
        return memberMapper.updateByPrimaryKey(member);
    }

    /**
     * @return com.murray.websocketmurray.doman.Member
     * @Description: 根据主键查询
     * @Param [memberId]
     * @author Murray Law
     * @date 2020/3/9 12:25
     */
    public Member selectByPrimaryKey(Integer memberId) {
        return memberMapper.selectByPrimaryKey(memberId);
    }

}
