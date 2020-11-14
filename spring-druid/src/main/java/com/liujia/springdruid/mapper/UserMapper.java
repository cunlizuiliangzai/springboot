package com.liujia.springdruid.mapper;

import com.liujia.springdruid.domain.User;
import com.liujia.springdruid.query.UserQuery;

import java.util.List;

public interface UserMapper {
    User getUserById(String userId);

    List<User> getUserByPage(UserQuery userQuery);
}