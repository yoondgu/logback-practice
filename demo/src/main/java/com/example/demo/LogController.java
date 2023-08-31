package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {

    @GetMapping("/all")
    public void logAllLevels(String message) {
        log.trace("trace {}", message);
        log.debug("debug {}", message);
        log.info("info {}", message);
        log.warn("warn {}", message);
        log.error("error {}", message);
    }
}
