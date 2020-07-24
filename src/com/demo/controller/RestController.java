package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/24 15:58
 */
@Controller
@RequestMapping("/rest")
public class RestController {

    /**
     * REST 资源表现层状态转化：简洁的URL提交请求，以请求方式来区分对资源的操作类型
     *
     *      /book/1        GET：查询id为1的图书
     *                     PUT：更新id为1的图书
     *                     DELETE：删除id为1的图书
     *                     POST：新增一本图书
     */
    @RequestMapping("/restRequest")
    public String restRequest(){
        return "success";
    }
}
