package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/7 14:14
 * 拦截器测试类
 */
@Controller
public class InterceptorController {

    @RequestMapping("/interReq")
    public String interReq(){
        return "error";
    }
}
