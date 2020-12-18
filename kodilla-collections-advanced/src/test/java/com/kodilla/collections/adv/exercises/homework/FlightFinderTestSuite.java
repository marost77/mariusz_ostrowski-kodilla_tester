package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFlightFrom(){
        //given

        //when

        //then
        assertEquals(3, flightFinder.findFlightsFrom("WAW").size());
        assertEquals(1, flightFinder.findFlightsFrom("GDA").size());
    }

    @Test
    public void testFlightTo(){
        //given

        //when

        //then
        assertEquals(3, flightFinder.findFlightsTo("GDA").size());
        assertEquals(1, flightFinder.findFlightsTo("KRA").size());
    }

}