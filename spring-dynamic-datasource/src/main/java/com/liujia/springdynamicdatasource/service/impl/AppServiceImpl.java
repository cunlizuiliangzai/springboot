package com.liujia.springdynamicdatasource.service.impl;

import com.liujia.springdynamicdatasource.dao.AppDao;
import com.liujia.springdynamicdatasource.entity.App;
import com.liujia.springdynamicdatasource.service.AppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    protected AppDao appDao;

    public int insert(App entity) {
        return appDao.insert(entity);
    }

    public int deleteByPrimaryKey(Integer id) {
        return appDao.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKey(App record) {
        return appDao.updateByPrimaryKey(record);
    }

    public List<App> selectAll() {
        return appDao.selectAll();
    }
}