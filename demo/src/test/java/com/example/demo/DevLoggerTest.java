package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = "dev")
class DevLoggerTest {

    @Autowired
    protected LogController logController;

    @DisplayName("dev 환경: debug 레벨 file 로깅, error 레벨 file 로깅, warn 레벨의 file 로깅")
    @Test
    void consoleAndFile() {
        logController.logAllLevels("dev");
    }

}
