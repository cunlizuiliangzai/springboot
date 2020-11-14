package com.liujia.springdruid.service;

import com.liujia.springdruid.domain.User;
import com.liujia.springdruid.query.UserQuery;

import java.util.Map;

public interface UserService {
    User getUserById(String userId);

    Map getUserByPage(UserQuery userQuery);
}
