package com.demo.controller;

import com.demo.bean.Book;
import com.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

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

    /**
     * forward 转发
     * redirect 重定向
     */
    @RequestMapping("/helloPage")
    public String helloPage(){
        System.out.println("helloPage进来了");
        return "forward:/helloPage.jsp";
//        return "redirect:/helloPage.jsp";
    }

    @RequestMapping("/doSomething")
    @ResponseBody
    public String doSomething(){
        return indexService.doSomething();
    }

    @RequestMapping("/updateBook")
    public String updateBook(@ModelAttribute("book")Book book){
        System.out.println(book);
        return "success";
    }

    /**
     * @ModelAttribute 在所有方法之前执行，会提前创建某些需要的值
     *
     * 上面的方法会引用，是一个隐含模型
     */
    @ModelAttribute
    public void getBook(Map<String,Object> map){
        Book book = new Book("西游记","吴承恩",99.99,10);
        map.put("book",book);
    }
}
