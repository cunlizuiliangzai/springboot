package com.liujia.springdynamicdatasource.dao;


import com.liujia.springdynamicdatasource.entity.App;

import java.util.List;

public interface AppDao {
    int deleteByPrimaryKey(Integer id);

    int insert(App record);

    App selectByPrimaryKey(Integer id);

    List<App> selectAll();

    int updateByPrimaryKey(App record);

    int insert2(App app);
}