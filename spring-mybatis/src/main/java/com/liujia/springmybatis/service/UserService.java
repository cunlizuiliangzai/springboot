package com.liujia.springmybatis.service;

import com.liujia.springmybatis.domain.UserWithBLOBs;
import com.liujia.springmybatis.query.UserQueryParam;

import java.util.Map;

public interface UserService {
    UserWithBLOBs getUserById(String userId);

    Map queryUserByPage(UserQueryParam userQueryParam);
}
