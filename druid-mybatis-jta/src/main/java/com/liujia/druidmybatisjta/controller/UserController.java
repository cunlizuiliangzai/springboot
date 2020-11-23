package com.liujia.druidmybatisjta.controller;

import com.liujia.druidmybatisjta.entity.User;
import com.liujia.druidmybatisjta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @PostMapping("save")
    @Transactional
    public void save(@RequestBody User user){
        userServiceImpl.testInsertUser(user);
        userServiceImpl.testInsertUser2(user);
        int i = 1 / 0;

    }
}
