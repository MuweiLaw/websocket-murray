package com.murray.websocketmurray.controller;


import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @author:MuweiLaw
 * @Date:2020/3/5 14:56
 */
//@RequestMapping("base")
//@Controller
public class BaseController {
    //定义私有属性
    protected String login;

    //顶级父类初始化函数,子类没必要初始化,因为这里面不写初始值
    public void construct() throws Exception {
        //显示所有错误,除了注意的提示
        this.login = "aaarrrccffff";
    }

    //模版显示
    public String views() {
        return "/views/v1/index/home.php";
    }

    /*
     * 获取post数据,不包含file类型
     */
//    @PostMapping("getPost")
    public HttpServletRequest getPost(HttpServletRequest request) {

//        //如果request为空,可能传的是json字符串,做一下兼容ios
//        if(empty($request)){
//            //获取post
//            $file_get_contents=file_get_contents("php://input");
//            if(!empty($file_get_contents)) {
//                $request=json_decode($file_get_contents,true);
//                $request['is_stream']=1;//当前使用流方式post数据
//            }
//        }
//
//        //如果有值 post get 其它
//        if(!empty($request)){
//
//            //删除传空的字段
//            $this->arrayFormat($request);
//
//            if($request){
//
//                //生成时间分格符
//				\App\Command\Func::logs(BASE_PATH."/storage/logs/post.txt",'----------------------'.date('Y-m-d H:i:s').'-----------------------'."\r\n",FILE_APPEND);//追加内容
//
//                //生成当前url
//				\App\Command\Func::logs(BASE_PATH."/storage/logs/post.txt",'$postUrl='.'http://'.@$_SERVER['HTTP_HOST'].@$_SERVER['REQUEST_URI']."\r\n",FILE_APPEND);//追加内容
//
//                //生成post数组
//				\App\Command\Func::logs(BASE_PATH."/storage/logs/post.txt",'$postData='.var_export($request,TRUE)."\r\n",FILE_APPEND);//追加内容
//            }
//
//        }

        //返回
        return request;
    }
}
