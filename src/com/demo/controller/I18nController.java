package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/7 16:41
 */
@Controller
public class I18nController {

    @RequestMapping("loginPage")
    public String loginPage(){
        return "login";
    }
}
