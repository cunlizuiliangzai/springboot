package com.liujia.springdatajpa.servie.impl;

import com.liujia.springdatajpa.dao.AppDao;
import com.liujia.springdatajpa.entity.App;
import com.liujia.springdatajpa.query.PageQuery;
import com.liujia.springdatajpa.servie.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {


    @Autowired
    private AppDao appDao;

    @Override
    public void save(App app) {
        appDao.save(app);
    }

    @Override
    public void delete(App app) {
        appDao.delete(app);
    }

    @Override
    public Object findAll() {
        return appDao.findAll();
    }

    @Override
    public Object findPage(PageQuery pageQuery) {
        return appDao.findAll(PageRequest.of(pageQuery.getPage(), pageQuery.getSize()));
    }
}
