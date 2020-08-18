package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/7 16:41
 */
@Controller
public class I18nController {

    @RequestMapping("loginPage")
    public String loginPage(@RequestParam(value = "locale",defaultValue = "zh_CN") String localeStr, Locale locale, HttpSession session){
//        Locale sessionLocale = locale;
//        if(localeStr!=null && !"".equals(localeStr)){
//            sessionLocale = new Locale(localeStr.split("_")[0],localeStr.split("_")[1]);
//        }
//        session.setAttribute(SessionLocaleResolver.class.getName() + ".LOCALE",sessionLocale);
        return "login";
    }
}
