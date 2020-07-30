package com.demo.view;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/30 17:45
 * View（MyView）是用来定义具体返回的东西
 */
public class MyView implements View {

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("<h1>hhh</h1>");
    }
}
