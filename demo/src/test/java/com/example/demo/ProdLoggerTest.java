package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = "prod")
class ProdLoggerTest {

    @Autowired
    protected LogController logController;

    @DisplayName("prod 환경: info 레벨 file 로깅, error 레벨 file 로깅, warn 레벨의 file 로깅")
    @Test
    void consoleAndFile() {
        logController.logAllLevels("prod");
    }

}
