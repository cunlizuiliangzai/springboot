package com.liujia.springswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "类注解  描述")
@RestController
public class HelloController {

    @ApiOperation(value = "方法注解", notes = "")
    @GetMapping(value="/hello")
    public Object hello( /* 参数注解 */ @ApiParam(value = "参数注解 " , required=true ) @RequestParam String name) {
        return "Hello " + name + "!";
    }




}
