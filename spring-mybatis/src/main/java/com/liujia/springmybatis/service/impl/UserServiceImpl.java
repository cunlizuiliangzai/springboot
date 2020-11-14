package com.liujia.springmybatis.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.liujia.springmybatis.domain.User;
import com.liujia.springmybatis.domain.UserWithBLOBs;
import com.liujia.springmybatis.mapper.UserMapper;
import com.liujia.springmybatis.query.UserQueryParam;
import com.liujia.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserWithBLOBs getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public Map queryUserByPage(UserQueryParam userQueryParam) {
        Map<String, Object> data = new HashMap<>();
        try {
            Integer pageNum = userQueryParam.getPageNum() != null ? userQueryParam.getPageNum() : 1;
            Integer pageSize = userQueryParam.getPageSize() != null ? userQueryParam.getPageSize() : 10;
            Page page = PageHelper.startPage(pageNum, pageSize, true);
            List<User> list = userMapper.queryUserByPage(userQueryParam);
            data.put("total", page.getTotal());
            data.put("nowPage", pageNum);
            data.put("data", list);
            return data;
        }catch (Exception e){
            return null;
        }
    }
}
