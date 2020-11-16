package com.liujia.springdynamiccreatetable.controller;

import com.liujia.springdynamiccreatetable.domain.UserLog;
import com.liujia.springdynamiccreatetable.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/log/")
public class UserLogController {

    @Autowired
    private UserLogService userLogService;

    @PostMapping(value="/save")
    public Object save(@RequestBody UserLog userLog) {
        String tableName = userLog.getTableName();
        userLogService.save(tableName, userLog);
        return 1;
    }

    @GetMapping(value="/findAll")
    public Object findAll(String tableName) {
        return userLogService.findAll(tableName);
    }


}
