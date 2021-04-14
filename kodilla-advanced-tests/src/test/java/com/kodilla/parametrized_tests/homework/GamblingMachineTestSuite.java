package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;


class GamblingMachineTestSuite {

    public GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineUserNumbersTo50.csv", numLinesToSkip = 1)
    public void shouldCountWins(int num1, int num2, int num3, int num4, int num5, int num6) throws InvalidNumbersException {
        Set<Integer> testNumbers = new HashSet<>();
        testNumbers.add(num1);
        testNumbers.add(num2);
        testNumbers.add(num3);
        testNumbers.add(num4);
        testNumbers.add(num5);
        testNumbers.add(num6);
        boolean result = gamblingMachine.howManyWins(testNumbers) <= 6;
        Assertions.assertTrue(result);
    }


    @Test
    public void shouldThrowExceptionWrongNumbers() throws InvalidNumbersException {
        Set<Integer> testNumbers = new HashSet<>();
        testNumbers.add(0);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        testNumbers.add(5);
        testNumbers.add(6);
        testNumbers.add(7);
        testNumbers.add(8);

        Assertions.assertThrows(InvalidNumbersException.class, ()->gamblingMachine.validateNumbers(testNumbers),"Wrong numbers provided");
    }



}
