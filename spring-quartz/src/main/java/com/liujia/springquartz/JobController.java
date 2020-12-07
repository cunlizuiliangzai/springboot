package com.liujia.springquartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Job")
public class JobController {
    @Autowired
    TestJobService jobService;

    @GetMapping(value = "/addJob")
    public String addJob() throws Exception {
        jobService.buildJob();
        return "start Job";
    }
}