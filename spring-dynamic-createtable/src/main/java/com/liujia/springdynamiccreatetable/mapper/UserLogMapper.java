package com.liujia.springdynamiccreatetable.mapper;

import com.liujia.springdynamiccreatetable.domain.UserLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLogMapper {

    void save(@Param("tableName") String tableName, @Param("userLog") UserLog userLog);


    List<UserLog> findAll(@Param("tableName") String tableName);

    /**
     * 是否存在表
     * @param tableName
     * @return
     */
    int existTable(@Param("tableName")String tableName);
    /**
     * 删除表
     * @param tableName
     * @return
     */
    int dropTable(@Param("tableName")String tableName);
    /**
     * 创建表
     * @param tableName
     * @return
     */
    int createTable(@Param("tableName")String tableName);
}