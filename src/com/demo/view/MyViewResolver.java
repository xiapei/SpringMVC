package com.demo.view;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.Locale;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/30 17:44
 * ViewResolver（MyViewResolver）是用来解析视图，根据自己定义的规则解析出不同的View（MyView）并返回
 */
public class MyViewResolver implements ViewResolver, Ordered {

    /**
     * 视图解析器的执行顺序；默认视图解析器InternalResourceViewResolver的执行顺序为private int order = 2147483647最大
     */
    private int order;

    private final static String PREFIX = "go:";

    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        if(s.startsWith(PREFIX)){
//            return new InternalResourceView(s.substring(3));
            return new MyView();
        }else {
            return null;
        }
    }

    @Override
    public int getOrder() {
        return this.order;
    }

    public void setOrder(int order){
        this.order = order;
    }
}
