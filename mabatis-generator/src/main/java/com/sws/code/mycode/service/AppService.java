package com.sws.code.mycode.service;

import com.sws.code.mycode.dao.AppDao;
import com.sws.code.mycode.entity.App;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
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