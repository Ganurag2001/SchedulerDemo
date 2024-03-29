package com.scheduler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SchedulerDemoApplication {

//	Logger logger = LoggerFactory.getLogger(SchedulerDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SchedulerDemoApplication.class, args);
    }

//	@Scheduled(fixedRate = 2000L)
//	@Scheduled(fixedDelayString = "PT2S")
//	public void job(){
//		logger.info("Job Current Time " + new Date());
//	}


}
