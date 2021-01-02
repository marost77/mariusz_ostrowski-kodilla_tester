package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.assertEquals;


class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideDataForPerson")
    public void shouldCalculateBMI(double height, double weight, String bmi) {
        Person person = new Person(height,weight);
        String result = person.getBMI();
        assertEquals(bmi,person.getBMI());
    }

}