package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;

import java.util.List;


public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();
        for (int i = 0; i < FlightRepository.getFlightsTable().size(); i++) {
            if (FlightRepository.getFlightsTable().get(i).getDeparture() == departure) {
                String arrival = FlightRepository.getFlightsTable().get(i).getArrival();
                flightsFrom.add(new Flight(departure, arrival));
            }
        }
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsTo = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival() == arrival) {
                String departure = flight.getDeparture();
                flightsTo.add(new Flight(departure, arrival));
            }
        }
        return flightsTo;
    }
}
