package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldShowTimeNow(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);

        LocalTime expectedTime = LocalTime.now();
        LocalTime test1Time = clock1.showTime();


        Assertions.assertNotEquals(expectedTime,test1Time);

    }

}