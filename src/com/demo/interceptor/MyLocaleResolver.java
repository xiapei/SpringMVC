package com.demo.interceptor;

import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/8 10:10
 */
public class MyLocaleResolver implements LocaleResolver {
    /**
     * AcceptHeaderLocaleResolver：使用请求头的区域信息
     * FixedLocaleResolver：使用系统默认的区域信息
     * SessionLocaleResolver：区域信息是从session中获取的；可以根据请求参数创建一个locale对象，放在session中
     * CookieLocaleResolver：类似session
     */

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        Locale locale = null;
        String localeStr = httpServletRequest.getParameter("locale");
        if(localeStr!=null && !"".equals(localeStr)){
            locale = new Locale(localeStr.split("_")[0],localeStr.split("_")[1]);
        }else {
            locale = httpServletRequest.getLocale();
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
