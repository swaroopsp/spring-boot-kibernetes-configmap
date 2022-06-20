package com.kibernetes.configmap.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@Slf4j
public class ControllerMVC {


    @Value("${database.username:defaultValue}")
    protected String fromSystem;

    @Scheduled(fixedDelay = 3000)
    public void schedule() {
        System.out.println(fromSystem);
        log.debug("DEBUG LOG");
        log.info("INFO LOG");
        log.warn("WARN LOG");
        log.error("ERROR LOG");
    }





}
