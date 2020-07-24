package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/24 13:46
 */
@Controller
@RequestMapping("/request")
public class RequestMappingController {

    @RequestMapping(value = "/requestMethod",method = RequestMethod.POST)
    public String requestMethod(){
        return "success";
    }
}
