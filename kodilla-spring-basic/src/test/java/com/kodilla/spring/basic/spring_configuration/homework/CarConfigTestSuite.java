package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CarConfigTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    Car car = (Car) context.getBean("createCar");

    @Test
    void shouldCreateCar() {

        List<String> possibleCars = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCars.contains(car.getCarType()));
    }

    @Test
    void shouldTurnOffLights(){

        Boolean checker = car.hasHeadlightsTurnedOn(7);
        Assertions.assertFalse(checker);
    }

    @Test
    void shouldTurnOnLights(){

        Boolean checker = car.hasHeadlightsTurnedOn(21);
        Assertions.assertTrue(checker);
    }





}