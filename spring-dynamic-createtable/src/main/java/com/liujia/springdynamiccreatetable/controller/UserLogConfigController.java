package com.liujia.springdynamiccreatetable.controller;

import com.liujia.springdynamiccreatetable.domain.UserLogConfig;
import com.liujia.springdynamiccreatetable.mapper.UserLogMapper;
import com.liujia.springdynamiccreatetable.service.UserLogConfigService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("用户日志配置")
@RestController
@RequestMapping("user/log/config")
public class UserLogConfigController {


    @Autowired
    private UserLogConfigService userLogConfigServiceImpl;


    @PostMapping("save")
    public void save(@RequestBody UserLogConfig userLogConfig){

        userLogConfigServiceImpl.save(userLogConfig);
    }


    @GetMapping("findAll")
    public List<UserLogConfig> findAll(){
       return userLogConfigServiceImpl.findAll();
    }
}
