package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/23 17:53
 */
@Controller
public class IndexController {

    @RequestMapping("/hello")
    public String goHello(){
        System.out.println("hello进来了");
        return "hello";
    }

    @RequestMapping("/error")
    public String goError(){
        System.out.println("error进来了");
        return "error";
    }
}
