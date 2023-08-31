package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
public class LoggerTest {

    @Autowired
    protected LogController logController;

    @Nested
    class LocalLoggerTest {

        @DisplayName("local 환경: info 레벨의 console 로깅")
        @Test
        void console() {
            logController.logAllLevels("local");
        }
    }

    @Nested
    @ActiveProfiles(value = "dev")
    class DevLoggerTest {

        @DisplayName("dev 환경: error 레벨 file 로깅, warn 레벨의 file 로깅")
        @Test
        void consoleAndFile() {
            logController.logAllLevels("dev");
        }
    }

    @Nested
    @ActiveProfiles(value = "warn 레벨의 file 로깅, error 레벨의 file 로깅")
    class ProdLoggerTest {

        @Test
        void consoleAndFile() {
            logController.logAllLevels("prod");
        }
    }
}
