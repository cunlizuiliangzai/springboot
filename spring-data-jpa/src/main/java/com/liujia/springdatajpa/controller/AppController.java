package com.liujia.springdatajpa.controller;

import com.liujia.springdatajpa.entity.App;
import com.liujia.springdatajpa.query.PageQuery;
import com.liujia.springdatajpa.servie.AppService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("App")
@RestController
@RequestMapping("/app/")
public class AppController {

    @Autowired
    private AppService appServiceImpl;

    @PostMapping(value="/save")
    public Object save(@RequestBody App app) {
        appServiceImpl.save(app);
        return 1;
    }

    @PostMapping(value="/delete")
    public Object delete(@RequestBody App app) {
        appServiceImpl.delete(app);
        return 1;
    }

    @GetMapping(value="/findAll")
    public Object findAll() {
        return appServiceImpl.findAll();
    }

    @PostMapping(value="/findPage")
    public Object findPage(@RequestBody PageQuery pageQuery) {
        return appServiceImpl.findPage(pageQuery);
    }


}
