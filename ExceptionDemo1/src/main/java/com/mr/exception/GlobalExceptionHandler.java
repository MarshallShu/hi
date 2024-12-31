package com.mr.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler({ NullPointerException.class, MissingServletRequestParameterException.class })
    @ExceptionHandler(NullPointerException.class) // 拦截空指针异常
    @ResponseBody // 直接返回字符串
    public String nullPointerExceptionHandler() {
        return "{\"code\":\"400\",\"msg\":\"传入的参数为空\"}";// 拼接成Json格式
    }
}
