package com.kodilla.spring.basic.spring_configuration.homework;


public interface Car {

    Car car(String season, int rideHour);

    public boolean hasHeadlightsTurnedOn(int rideHour);

    String getCarType();


}
