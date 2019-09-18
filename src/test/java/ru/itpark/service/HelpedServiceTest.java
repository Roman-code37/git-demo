package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelpedServiceTest {

    @Test
    void initials() {
        {
            HelpedService service = new HelpedService();
            String actual = service.initials("Vasiliy Petrov");
            String expered = "VP";
            assertEquals(expered, actual);
        }
    }
}