package com.liujia.springquartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestJobService {

    @Autowired
    private Scheduler quartzScheduler;

    public void buildJob() throws SchedulerException {
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ? ");
        JobDetail jobDetail = JobBuilder.newJob(TestJob.class)
                // (name,group) 用于定位任务
                .withIdentity("job1","quartzTaskJob").build();
        //创建任务触发器
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("job1","quartzTaskJob")
                .withSchedule(scheduleBuilder).build();
        //定义触发器将触发器与任务绑定到调度器内
        quartzScheduler.scheduleJob(jobDetail, trigger);
        //启动
        quartzScheduler.start();
    }
}
