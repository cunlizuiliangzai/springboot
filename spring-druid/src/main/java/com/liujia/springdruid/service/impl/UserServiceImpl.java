package com.liujia.springdruid.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.liujia.springdruid.domain.User;
import com.liujia.springdruid.mapper.UserMapper;
import com.liujia.springdruid.query.UserQuery;
import com.liujia.springdruid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public Map getUserByPage(UserQuery userQuery) {
        Page page = PageHelper.startPage(userQuery.getPageNum(), userQuery.getPageSize(), true);
        List<User> userList = userMapper.getUserByPage(userQuery);
        HashMap<String, Object> map = new HashMap<>();
        map.put("row", userList);
        map.put("count", page.getTotal());
        return map;
    }
}
