package com.yvelianyk.taskmanagementapplesson;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ContextIntegrationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void whenContexIsLoaded_thenNoExceptions() {
        //
    }

    @Test
    public void whenContexIsLoaded_thenNoExceptions2() {
        //
    }
}
