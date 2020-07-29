package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/24 13:46
 */
@Controller
@RequestMapping("/request")
public class RequestMappingController {

    /**
     * RequestMapping可以设置的属性：
     *
     *      method 请求的方法：http规定的请求方法有
     *          GET、HEAD、POST、PUT、PATCH、DELETE、OPTIONS、TRACE
     *
     *      params 携带参数或者不携带：{"username=xp","password","!age"}
     *
     *      headers 请求头
     *
     *      consumes ：规定请求头中的Content-Type，只接受内容类型符合的请求
     *
     *      produces ：返回的内容类型是什么，给响应头中加上Content-Type:text/html;charset=UTF-8
     *
     * RequestMapping模糊匹配：Ant风格的url地址
     *
     *      ?：任意一个字符，0个或多个字符都不行：相同时精确的优先
     *      *：多个字符或一层路径，0个或多个字符都可以
     *      **：替代多层路径
     *
     * RequestMapping获取路径上的占位符
     *      @RequestMapping("/delete/{id}")  public * * (@PathVariable("id")String id){}
     *      只能占一层路径
     */
    @RequestMapping(value = "/request")
    public String request(){
        return "success";
    }

    /**
     * SpringMVC调用源码，执行过程
     *
     * 1、所有请求过来都会被 继承了tomcat-->web.xml的项目下web.xml的DispatcherServlet拦截，并收到请求
     * 2、然后再调用doDispatch方法进行处理
     *      1）getHandler()：根据当前请求地址 在HandlerMapping中找到这个请求的映射信息，获取能处理这个请求的目标处理器类
     *      2）getHandlerAdapter()：根据当前处理器类 找到当前类的HandlerAdapter适配器
     *      3）使用刚才获取到的适配器（AnnotationMethodHandlerAdapter）执行目标方法
     *      4）目标方法执行后会返回一个ModelAndView对象
     *      5）根据ModelAndView的信息转发到具体的页面，并可以在请求域中取出ModelAndView中的数据模型
     *
     *
     * SpringMVC九大组件：在工作的时候，关键位置都是由这些组件完成；组件全部为接口，接口就是规范，提供了非常强大的拓展性
     *     组件的初始化在DispatcherServlet的onRefresh()-->initStrategies()方法中，服务器启动就调用onRefresh()
     *
     *     文件上传解析器
     *     private MultipartResolver multipartResolver;
     *     区域信息解析器（国际化）
     *     private LocaleResolver localeResolver;
     *     主题解析器（主题效果更换）
     *     private ThemeResolver themeResolver;
     *     Handler映射信息
     *     private List<HandlerMapping> handlerMappings;
     *     Handler适配器
     *     private List<HandlerAdapter> handlerAdapters;
     *     异常解析功能
     *     private List<HandlerExceptionResolver> handlerExceptionResolvers;
     *
     *     private RequestToViewNameTranslator viewNameTranslator;
     *     重定向携带数据的功能
     *     private FlashMapManager flashMapManager;
     *     视图解析器
     *     private List<ViewResolver> viewResolvers;
     */
}
