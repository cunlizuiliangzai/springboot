package com.liujia.springdruid.service.impl;

import com.liujia.springdruid.domain.User;
import com.liujia.springdruid.query.UserQuery;
import com.liujia.springdruid.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserNewServiceImpl implements UserService {
    @Override
    public User getUserById(String userId) {
        return new User();
    }

    @Override
    public Map getUserByPage(UserQuery userQuery) {
        return new HashMap();
    }
}
