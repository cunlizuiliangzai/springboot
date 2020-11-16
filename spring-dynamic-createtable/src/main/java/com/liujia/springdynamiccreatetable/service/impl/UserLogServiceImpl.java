package com.liujia.springdynamiccreatetable.service.impl;

import com.liujia.springdynamiccreatetable.domain.UserLog;
import com.liujia.springdynamiccreatetable.mapper.UserLogMapper;
import com.liujia.springdynamiccreatetable.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLogServiceImpl implements UserLogService {

    @Autowired
    private UserLogMapper userLogMapper;


    @Override
    public void save(String tableName, UserLog userLog) {
        userLogMapper.save(tableName,userLog);
    }

    @Override
    public List<UserLog> findAll(String tableName) {
        return userLogMapper.findAll(tableName);
    }


}
