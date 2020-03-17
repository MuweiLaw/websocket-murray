package com.murray.websocketmurray.service;

/**
 * @Description: PHP项目的Controller.php
 * @author: Murray Law
 * @Date:2020/3/11 12:01
 */

public class BaseServer {
    /*
     * 生成json 兼容模式， 设置消息提示, 为了解决json_decode 一维数组为：{"code":1,"msg":"操作成功!","data":{}} , 二组数组为: {"code":1,"msg":"操作成功!","data":[]} 接口推荐返回方式 优点：会生成调试日志,兼容ios andriod
     * @param Int code 传入状态 0错误，1正确
     * @param String msg 传入消息提示
     * @return Arr data 返回的数组对象
     */
    public String msg(int code, String msg, String data) {
        if(null==msg||"".equals(msg)){
            msg="会员名不能为空";
        }
        String json = "";
//        if (null !=data) {
//
//        }
        json="{\"code\":\""+code+"\",\"msg\":"+msg+"\",\"data\":"+data+"\"}";
        return json;
    }

}
