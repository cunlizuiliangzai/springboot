package com.liujia.springshiro.service;

import com.liujia.springshiro.bean.Role;
import com.liujia.springshiro.bean.User;

public interface LoginService {
    User addUser(User user);

    Role addRole(Role role);

    User findByName(String name);
}
