package com.murray.websocketmurray.service;

import com.dc.codelegend.domain.QuestionOnline;
import com.dc.codelegend.generator.mapper.QuestionOnlineIMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description: 问题在线服务
 * @author: Murray Law
 * @Date:2020/3/9 11:42
 */
@Service("questionOnlineServer")
public class QuestionOnlineServer extends BaseServer {
    @Autowired
    private QuestionOnlineIMapper questionOnlineMapper;
    //自动注入redis在线记录对象
//    @Autowired
//    private RedisTemplate redisTemplate;

    /**
     * @return int
     * @Description: 插入数据服务
     * @Param [memberId]
     * @author Murray Law
     * @date 2020/3/9 12:24
     */
    public int insert(QuestionOnline questionOnline) {
        return questionOnlineMapper.insert(questionOnline);
    }

    /**
     * @return int
     * @Description: 根据主键删除
     * @Param [memberId]
     * @author Murray Law
     * @date 2020/3/9 12:26
     */
    public int deleteByPrimaryKey(Integer questionOnlineId) {
        return questionOnlineMapper.deleteByPrimaryKey(questionOnlineId);
    }

    /**
     * @return int
     * @Description: 根据memberId进行删除
     * @Param [memberId]
     * @author Murray Law
     * @date 2020/3/11 0:22
     */
    public Boolean deleteByMemberId(Integer memberId) {
        if (questionOnlineMapper.deleteByMemberId(memberId) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return int
     * @Description: 根据主键更新
     * @Param [member]
     * @author Murray Law
     * @date 2020/3/9 12:27
     */
    public int updateByPrimaryKey(QuestionOnline questionOnline) {
        return questionOnlineMapper.updateByPrimaryKey(questionOnline);
    }

    /**
     * @return com.dc.codelegend.domain.Member
     * @Description: 根据主键查询
     * @Param [memberId]
     * @author Murray Law
     * @date 2020/3/9 12:25
     */
    public QuestionOnline selectByPrimaryKey(Integer questionOnlineId) {
        return questionOnlineMapper.selectByPrimaryKey(questionOnlineId);
    }

    /**
     * @return java.util.List<com.dc.codelegend.domain.QuestionOnline>
     * @Description: 用map随机查询
     * @Param [map]
     * @author Murray Law
     * @date 2020/3/13 12:46
     */
    public List<QuestionOnline> selectByMapOrderByRand(Map<String, String> map) {
        return questionOnlineMapper.selectByMapOrderByRand(map);
    }

    public List<QuestionOnline> selectByMap(Map<String, String> map) {
        return questionOnlineMapper.selectByMap(map);
    }
}
