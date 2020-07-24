package com.demo.controller;

import com.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/23 17:53
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String goHello(){
        System.out.println("hello进来了");
        return "hello";
    }

    @RequestMapping("/error")
    public String goError(){
        System.out.println("error进来了");
        return "error";
    }

    @RequestMapping("/doSomething")
    @ResponseBody
    public String doSomething(){
        return indexService.doSomething();
    }
}
