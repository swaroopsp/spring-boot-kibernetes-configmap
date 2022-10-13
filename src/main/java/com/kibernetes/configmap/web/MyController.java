package com.kibernetes.configmap.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@Slf4j
public class MyController {

    @Value("${database.username:defaultValue}")
    protected String fromSystem;

    @GetMapping("/greeting")
    public String greeting() {
        System.out.println(fromSystem);
        log.debug("DEBUG LOG");
        log.info("INFO LOG");
        log.warn("WARN LOG");

        return fromSystem;
    }
}