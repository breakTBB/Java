package com.prism.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author prism17
 * @email 2839296425@qq.com
 * @create 2019/3/4 22:00
 **/
@Controller
public class Info {
    @RequestMapping("/about")
    public String about(HttpServletRequest request) {
        request.setAttribute("title", "我是标题");
        request.setAttribute("msg", "你有一条消息未查收");
        return "about";
    }
}
