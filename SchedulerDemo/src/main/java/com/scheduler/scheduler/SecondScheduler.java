package com.scheduler.scheduler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class SecondScheduler {
    Logger logger = LoggerFactory.getLogger(SchedulerDemoApplication.class);

    @Async("asyncTaskExecutor")
    @Scheduled(fixedRate = 1*1000)
    public void consumeRestApi(){
        logger.info("Job Second " + new Date());
    }
}
