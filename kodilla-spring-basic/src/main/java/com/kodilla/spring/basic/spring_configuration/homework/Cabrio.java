package com.kodilla.spring.basic.spring_configuration.homework;



public class Cabrio implements Car{


    @Override
    public Car newCar(String season, int rideHour) {
        return new Cabrio();
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
        return "Cabrio";
    }
}
