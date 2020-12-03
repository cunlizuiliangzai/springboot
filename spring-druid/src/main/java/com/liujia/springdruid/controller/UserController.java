package com.liujia.springdruid.controller;

import com.liujia.springdruid.domain.User;
import com.liujia.springdruid.query.UserQuery;
import com.liujia.springdruid.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@Api("用户")
@RestController
public class UserController {



    //Autowired 是spring注解，先根据类型查找，找不到再根据name，用qualifier指定别名
    // resource是jdk注解，先根据name查找，找不到再根据type，他有name和type属性指定
    @Resource(name = "userServiceImpl")
   // @Autowired
//    @Qualifier("userNewServiceImpl")
    private UserService userService;



    @ApiOperation(value = "根据用户id查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", required = true,
                    dataType = "string", paramType = "query", defaultValue = "123")
    })
    @GetMapping("/getUserById")
    @Transactional
    public User getUserById(@RequestParam("userId") String userId) {
        User user = userService.getUserById(userId);
        return user;
    }


    @ApiOperation(value = "分页查询用户")
    @PostMapping("getUserByPage")
    public Map getUserByPage(@RequestBody UserQuery userQuery) {
        Map map = userService.getUserByPage(userQuery);
        return map;
    }

}
