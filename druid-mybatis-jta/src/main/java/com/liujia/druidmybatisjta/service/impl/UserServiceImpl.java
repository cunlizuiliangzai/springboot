package com.liujia.druidmybatisjta.service.impl;

import com.liujia.druidmybatisjta.annotations.DataSource;
import com.liujia.druidmybatisjta.entity.User;
import com.liujia.druidmybatisjta.mapper.UserMapper;
import com.liujia.druidmybatisjta.service.UserService;
import com.liujia.druidmybatisjta.utils.DataSourceNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @DataSource(DataSourceNames.ONE)
    @Override
    public void testInsertUser(User user) {
        int insertNum = userMapper.insert(user);
        System.out.println("插入成功,条数："+insertNum);
    }

    @DataSource(DataSourceNames.TWO)
    @Override
    public void testInsertUser2(User user) {
        int insertNum = userMapper.insert(user);
        System.out.println("插入成功,条数："+insertNum);
    }
}
