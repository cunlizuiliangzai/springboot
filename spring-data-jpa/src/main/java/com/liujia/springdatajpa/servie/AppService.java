package com.liujia.springdatajpa.servie;

import com.liujia.springdatajpa.entity.App;
import com.liujia.springdatajpa.query.PageQuery;

public interface AppService {
    void save(App app);

    void delete(App app);

    Object findAll();


    Object findPage(PageQuery pageQuery);
}
