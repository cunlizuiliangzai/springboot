package com.liujia.springdynamicdatasource.controller;

import com.liujia.springdynamicdatasource.annotations.DataSource;
import com.liujia.springdynamicdatasource.entity.App;
import com.liujia.springdynamicdatasource.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}