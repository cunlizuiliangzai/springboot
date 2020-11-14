package com.liujia.springdruid.controller;

import com.liujia.springdruid.domain.User;
import com.liujia.springdruid.query.UserQuery;
import com.liujia.springdruid.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api("用户")
@RestController
public class UserController {

    @Autowired
    private UserService userServiceImpl;


    @ApiOperation(value = "根据用户id查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", required = true,
                    dataType = "string", paramType = "query", defaultValue = "123")
    })
    @GetMapping("/getUserById")
    public User getUserById(@RequestParam("userId") String userId) {
        User user = userServiceImpl.getUserById(userId);
        return user;
    }


    @ApiOperation(value = "分页查询用户")
    @PostMapping("getUserByPage")
    public Map getUserByPage(@RequestBody UserQuery userQuery) {
        Map map = userServiceImpl.getUserByPage(userQuery);
        return map;
    }

}
