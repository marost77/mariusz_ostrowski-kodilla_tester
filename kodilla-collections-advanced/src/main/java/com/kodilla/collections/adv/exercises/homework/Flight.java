package com.kodilla.collections.adv.exercises.homework;

public class Flight {
    private String arrival;
    private String departure;

    public Flight(String departure, String arrival) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
