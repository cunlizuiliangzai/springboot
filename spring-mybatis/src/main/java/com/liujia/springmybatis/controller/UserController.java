package com.liujia.springmybatis.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.liujia.springmybatis.domain.User;
import com.liujia.springmybatis.domain.UserWithBLOBs;
import com.liujia.springmybatis.mapper.UserMapper;
import com.liujia.springmybatis.query.UserQueryParam;
import com.liujia.springmybatis.service.UserService;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api("用户")
public class UserController {

    @Autowired
    UserService userServiceImpl;


    @ApiImplicitParams(@ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "string", paramType = "path"))
    @GetMapping("/getUserById/{userId}")
    public UserWithBLOBs getUserById(@PathVariable("userId") String userId) {

        return userServiceImpl.getUserById(userId);
    }


    @PostMapping("/queryUserByPage")
    @ResponseBody
    public Map queryUserByPage(@RequestBody UserQueryParam userQueryParam) {

        return userServiceImpl.queryUserByPage(userQueryParam);
    }
}
