package com.liujia.druidmybatisjta.mapper;

import com.liujia.druidmybatisjta.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int insert(User user);
}