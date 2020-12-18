package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){

        List<Flight> flightTable = new ArrayList<>();

        flightTable.add(new Flight("WAW","KRA"));
        flightTable.add(new Flight("WAW", "GDA"));
        flightTable.add(new Flight("WAW", "WRO"));
        flightTable.add(new Flight("GDA", "WRO"));
        flightTable.add(new Flight("KRA", "GDA"));
        flightTable.add(new Flight("WRO", "GDA"));

    return flightTable;
    }


}
