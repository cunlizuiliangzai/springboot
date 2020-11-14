package com.liujia.springmybatis.mapper;


import com.liujia.springmybatis.domain.User;
import com.liujia.springmybatis.domain.UserWithBLOBs;
import com.liujia.springmybatis.query.UserQueryParam;

import java.util.List;

public interface UserMapper {
    UserWithBLOBs getUserById(String userId);

    List<User> queryUserByPage(UserQueryParam userQueryParam);
}