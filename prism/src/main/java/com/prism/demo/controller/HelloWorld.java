package com.prism.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index() {
        return "Hi, I'm here!";
    }

    @RequestMapping("/test")
    public Map<String, String> testMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "prism");
        return map;
    }
}