package com.scheduler.scheduler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;

@Component
public class FirstScheduler {

    Logger logger = LoggerFactory.getLogger(SchedulerDemoApplication.class);


    @Async("asyncTaskExecutor")
//    @Scheduled(fixedRate = 5*1000)
    @Scheduled(cron = "*/5 * * * * *")
    public void getDataFromDB(){
        logger.info("Job First " + new Date());
    }

}
