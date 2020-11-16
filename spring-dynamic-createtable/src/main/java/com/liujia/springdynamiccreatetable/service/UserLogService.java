package com.liujia.springdynamiccreatetable.service;

import com.liujia.springdynamiccreatetable.domain.UserLog;

import java.util.List;

public interface UserLogService {
    /**
     * 保存用户日志
     * @return
     */
    void save(String tableName, UserLog userLog);

    /**
     * 查找全部用户日志
     * @return
     */
    List<UserLog> findAll(String tableName);
}
