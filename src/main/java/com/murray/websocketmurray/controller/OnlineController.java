package com.murray.websocketmurray.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Description:
 * @author:MuweiLaw
 * @Date:2020/3/5 14:55
 */
@RequestMapping("api/ws")
@Controller
public class OnlineController extends BaseController {
    //存放实例
    private static OnlineController instance = null;

    /**
     * @return
     * @Description: 私有化构造方法
     * @Param []
     * @author Murray Law
     * @date 2020/3/5 11:00
     */
    private OnlineController() {//本来是private的
//        System.out.println("单例模式的实例被构造了");
    }

    //私有化克隆方法
//    private void clone(){
//
//    }

    /**
     * @return com.murray.websocketmurray.controller.WebSocketController
     * @Description: 公有化获取实例方法 单例设计模式
     * @Param []
     * @author Murray Law
     * @date 2020/3/5 15:03
     */
    public static OnlineController getInstance() {
        if (instance == null) {
            instance = new OnlineController();
        }
        return instance;
    }

    //设置用户上线
    @GetMapping("online")
    @ResponseBody
    public void online(@RequestParam Map<String, Object> params) {

    }
}
