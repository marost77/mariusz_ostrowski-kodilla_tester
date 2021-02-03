package com.kodilla.spring.basic.spring_configuration.homework;


public interface Car {

    Car newCar(String season, int rideHour);

    boolean hasHeadlightsTurnedOn(int rideHour);

    String getCarType();


}
