package com.sws.code.mycode.controller;

import com.sws.code.mycode.entity.App;
import com.sws.code.mycode.service.AppService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private AppService appService;

    @RequestMapping("/insert")
    public int insert(App entity) {
        return appService.insert(entity);
    }

    @RequestMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id) {
        return appService.deleteByPrimaryKey(id);
    }

    @RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(App record) {
        return appService.updateByPrimaryKey(record);
    }

    @RequestMapping("/selectAll")
    public List<App> selectAll() {
        return appService.selectAll();
    }
}