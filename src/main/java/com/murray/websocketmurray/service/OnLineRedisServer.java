package com.murray.websocketmurray.service;

import com.murray.websocketmurray.domain.QuestionOnline;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.Map;

import static com.murray.websocketmurray.untils.Untils.objectToMap;
import static com.murray.websocketmurray.configuration.RedisConfig.AUTH;

/**
 * @Description:
 * @author: Murray Law
 * @Date:2020/3/11 10:51
 */
@Service("onLineRedisServer")
public class OnLineRedisServer extends BaseServer {
    //获取redis对象
    Jedis jedis = new Jedis();

    //删除redis中的在线用户
    public Long onlineDelete(QuestionOnline post) {
        //获取redis对象
        //权限密码
        jedis.auth(AUTH);
        //检查合法
        if (null == post.getMemberId()) {
            msg(0, "会员id不能为空,redis删除在线用户失败", null);
        }
        //删除在线用户
        Long isOk = jedis.del("online:" + post.getMemberId());
        Long isOk2 = jedis.lrem("online_length:", 1, String.valueOf(post.getMemberId()));
        //返回
        return isOk;
    }

    //添加redis在线用户
    public Map onlineAdd(Integer memberId, Object mysqlData) {
        String mysqlDataToString = mysqlData.toString();
        Map mysqlDataToMap = objectToMap(mysqlData);
        //检查合法
        if (null == memberId || null == mysqlData) {
            msg(0, "会员id或mysql_data不能为空,redis添加在线用户失败", mysqlDataToString);
            //return null;
        }
        //检查之前是否设置过了,防止重复设置
        Map<String, String> is_hmset = jedis.hgetAll("online:" + memberId);
        //没有设置过才会设置
        if (null == is_hmset) {
            //设置
            jedis.hmset("online:" + memberId, mysqlDataToMap);//添加数据
            jedis.rpush("online_length", String.valueOf(memberId));//添加后的数组长度
        } else {
            //如果有设置过,验证fd是否一致
            if (is_hmset.get("fd") != mysqlDataToMap.get("fd")) {//如果不相等,从新更改
                jedis.hmset("online:" + memberId, mysqlDataToMap);//只更改数据
            }

        }
        return mysqlDataToMap;
    }
}
