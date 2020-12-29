package com.kodilla.parametrized_tests.homework;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

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
        assertTrue(result);
    }


}
