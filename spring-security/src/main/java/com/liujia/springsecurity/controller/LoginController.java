package com.liujia.springsecurity.controller;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.liujia.springsecurity.security.JwtAuthenticatioToken;
import com.liujia.springsecurity.utils.SecurityUtils;
import com.liujia.springsecurity.vo.HttpResult;
import com.liujia.springsecurity.vo.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 登录控制器
 * @author Louis
 * @date Jun 29, 2019
 */
@RestController
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * 登录接口  登录sort 2
     */
    @PostMapping(value = "/login")
    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request) throws IOException {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();
        
        // 系统登录认证
        JwtAuthenticatioToken token = SecurityUtils.login(request, username, password, authenticationManager);
                
        return HttpResult.ok(token);
    }

}