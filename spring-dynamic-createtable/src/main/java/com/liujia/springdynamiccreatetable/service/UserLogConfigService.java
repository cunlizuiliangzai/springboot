package com.liujia.springdynamiccreatetable.service;

import com.liujia.springdynamiccreatetable.domain.UserLogConfig;

import java.util.List;

public interface UserLogConfigService {
    void save(UserLogConfig userLogConfig);

    List<UserLogConfig> findAll();

    void updateById(UserLogConfig userLogConfig);
}
