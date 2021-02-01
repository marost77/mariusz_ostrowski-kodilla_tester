package com.kodilla.spring.basic.spring_configuration.homework;


public class Sedan implements Car{

    @Override
    public Car car(String season, int rideHour) {
        return car(season, rideHour);
    }

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

