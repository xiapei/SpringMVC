package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/24 13:46
 */
@Controller
@RequestMapping("/request")
public class RequestMappingController {

    /**
     * RequestMapping可以设置的属性：
     *
     *      method 请求的方法：http规定的请求方法有
     *          GET、HEAD、POST、PUT、PATCH、DELETE、OPTIONS、TRACE
     *
     *      params 携带参数或者不携带：{"username=xp","password","!age"}
     *
     *      headers 请求头
     *
     *      consumes ：规定请求头中的Content-Type，只接受内容类型符合的请求
     *
     *      produces ：返回的内容类型是什么，给响应头中加上Content-Type:text/html;charset=UTF-8
     *
     * RequestMapping模糊匹配：Ant风格的url地址
     *
     *      ?：任意一个字符，0个或多个字符都不行：相同时精确的优先
     *      *：多个字符或一层路径，0个或多个字符都可以
     *      **：替代多层路径
     *
     * RequestMapping获取路径上的占位符
     *      @RequestMapping("/delete/{id}")  public * * (@PathVariable("id")String id){}
     *      只能占一层路径
     */
    @RequestMapping(value = "/request")
    public String request(){
        return "success";
    }
}
