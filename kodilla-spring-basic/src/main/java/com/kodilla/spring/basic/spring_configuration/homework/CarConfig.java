package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarConfig {


    @Bean
    public Car createCar() {
        //Car car;
        Random generator = new Random();
        int randomSeason = generator.nextInt(4);

        if (randomSeason == 1) {
            System.out.println("Winter SUV");
            return new SUV();
        } else if (randomSeason == 2) {
            System.out.println("Summer cabrio");
            return new Cabrio();
        } else if (randomSeason == 3) {
            System.out.println("Spring sedan");
            return new Sedan();
        } else if (randomSeason == 4) {
            System.out.println("Autumn sedan");

        }
        return new Sedan();
    }

}

