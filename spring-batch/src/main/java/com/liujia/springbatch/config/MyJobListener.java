package com.liujia.springbatch.config;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

    private Logger logger = LoggerFactory.getLogger(MyJobListener.class);

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("job 开始, id={}"+jobExecution.getJobId());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("job 结束, id={}"+jobExecution.getJobId());
    }
}