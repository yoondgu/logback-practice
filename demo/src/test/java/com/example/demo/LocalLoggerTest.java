package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
class LocalLoggerTest {

    @Autowired
    protected LogController logController;

    @DisplayName("local 환경: info 레벨의 console 로깅")
    @Test
    void console() {
        logController.logAllLevels("local");
    }

}
