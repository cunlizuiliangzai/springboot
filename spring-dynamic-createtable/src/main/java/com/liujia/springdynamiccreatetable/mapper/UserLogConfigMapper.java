package com.liujia.springdynamiccreatetable.mapper;

import com.liujia.springdynamiccreatetable.domain.UserLogConfig;

import java.util.List;

public interface UserLogConfigMapper {
    void save(UserLogConfig userLogConfig);

    List<UserLogConfig> findAll();

    void updateById(UserLogConfig userLogConfig);
}