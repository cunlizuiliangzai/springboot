package com.liujia.springshiro.dao;

import com.liujia.springshiro.bean.User;
import com.liujia.springshiro.dao.base.BaseDao;

public interface UserDao  extends BaseDao<User,Long> {

    User findByName(String name);
}
