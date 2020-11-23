package com.liujia.springdynamicdatasource.service;



import com.liujia.springdynamicdatasource.entity.App;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AppService {


    public int insert(App entity);

    public int deleteByPrimaryKey(Integer id);

    public int updateByPrimaryKey(App record);

    public List<App> selectAll();

    public int insert2(App app);
}