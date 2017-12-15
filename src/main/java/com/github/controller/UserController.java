package com.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Gosin
 * @Date: 2017/12/15 15:19
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * springmvc的第一个案例
     */
    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println("我的springmvc第一个demo");
        return "hello";
    }
}
