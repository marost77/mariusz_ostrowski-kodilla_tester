package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

@Component
public class Sedan implements Car{


    @Override
    public boolean hasHeadlightsTurnedOn(int rideHour) {
        if (rideHour > 6 && rideHour <20){
            return false;
        }
        return true;
    }

    @Override
    public String getCarType() {

        return "Sedan";
    }
}

