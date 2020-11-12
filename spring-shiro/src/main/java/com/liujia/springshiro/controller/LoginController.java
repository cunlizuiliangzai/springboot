package com.liujia.springshiro.controller;

import com.liujia.springshiro.bean.Role;
import com.liujia.springshiro.bean.User;
import com.liujia.springshiro.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * POST登录
     * @return
     */
    @PostMapping(value = "/login")
    public String login(@RequestBody User user) {
        // 添加用户认证信息
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getName(), user.getPassword());
        // 进行验证，这里可以捕获异常，然后返回对应信息
        SecurityUtils.getSubject().login(usernamePasswordToken);
        return "login ok!";
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequiresUser
    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user) {
        user = loginService.addUser(user);
        return "addUser is ok! \n" + user;
    }

    /**
     * 添加角色
     * @param role
     * @return
     */
    @PostMapping(value = "/addRole")
    public String addRole(@RequestBody Role role) {
        role = loginService.addRole(role);
        return "addRole is ok! \n" + role;
    }

    /**
     * 注解的使用
     * @return   Logical.AND 需要admin和user两种角色具备的人才能访问该接口   Logical.OR 两种角色之一
     */
    @RequiresRoles(value={"admin","user"},logical = Logical.AND)
    @RequiresPermissions(value = {"admin:a","user:b"},logical = Logical.OR)
    @GetMapping(value = "/create")
    public String create() {
        return "Create success!";
    }

    @RequiresRoles("admin")
    @RequiresPermissions("create")
    @PostMapping(value = "/index")
    public String index() {
        return "index page!";
    }

    @RequiresGuest
    @PostMapping(value = "/guest")
    public String guest() {
        return "index page!";
    }

    @GetMapping(value = "/error")
    public String error() {
        return "error page!";
    }

    /**
     * 退出的时候是get请求，主要是用于退出
     * @return
     */
    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout() {
        return "logout";
    }
}
