package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarConfig {


    //  @Bean("Sedan")
    //  public Car createSedan() {
    //     Car car;


    //     return new Sedan();
    // }


    // @Bean("SUV")
    // public Car createSUV() {
    //     return new SUV();
    //}


    // @Bean
    // public Car createCabrio() {
    //    return new Cabrio();
    //}

    @Bean
    public Car createCar() {
        //Car car;
        Random generator = new Random();
        int randomSeason = generator.nextInt(4);

        if (randomSeason == 1) {
            System.out.println("Winter");
            return new SUV();
        }
        else if (randomSeason == 1){
            System.out.println("Summer");
            return new Cabrio();
        }
        else if (randomSeason == 3){
            System.out.println("Spring");
            return new Sedan();}

        System.out.println("Autumn");
        return new Sedan();
    }

    @Bean
    public void headlightsCheck(){

        Random generator = new Random();
        int randomHour = generator.nextInt(24);
            createCar().hasHeadlightsTurnedOn(randomHour);
        }



}

