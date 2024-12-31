package com.mr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @RequestMapping("/index")
    public String index(String name) {
        if (name.equals("张三")) { // 未传入参数，name默认为null
            return name + ",欢迎您回来";
        } else {
            return "您的账号不正确，请您重新登录";
        }
    }
}
