package com.liujia.springdynamicdatasource.controller;

import com.liujia.springdynamicdatasource.annotations.DataSource;
import com.liujia.springdynamicdatasource.entity.App;
import com.liujia.springdynamicdatasource.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private AppService appService;

    @DataSource(value="master")
    @GetMapping("/selectAll")
    public List<App> selectAll() {
        return appService.selectAll();
    }

    @DataSource(value="slave")
    @GetMapping("/selectAll2")
    public List<App> selectAll2() {
        return appService.selectAll();
    }


    /**
     * （动态数据源不生效）
     */
    @PostMapping("/save")
    @DataSource(value="slave")
    public void save(@RequestBody App app) {
//        appService.insert(app);
        appService.insert2(app);
//        int i = 100 / 0;
    }


}