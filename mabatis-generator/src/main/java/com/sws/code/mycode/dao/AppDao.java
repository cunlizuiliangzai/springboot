package com.sws.code.mycode.dao;

import com.sws.code.mycode.entity.App;
import java.util.List;

public interface AppDao {
    int deleteByPrimaryKey(Integer id);

    int insert(App record);

    App selectByPrimaryKey(Integer id);

    List<App> selectAll();

    int updateByPrimaryKey(App record);
}