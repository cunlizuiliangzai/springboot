package com.liujia.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <p>
 * 测试而已 前端控制器
 * </p>
 *
 * @author liujia
 * @since 2020-09-15
 */
@RequestMapping("/test-order")
@Controller
public class TestOrderController {


    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {

        request.setAttribute("hello","123");
        return "a";
    }
}
