package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTestSuite {

    private StringManipulator manipulator = new StringManipulator();

    private static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }

    @ParameterizedTest
    //@CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve"})
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase(String input, String expected){
        assertEquals(expected,manipulator.reverseWithLowerCase(input));
    }

    //@ParameterizedTest
    //@MethodSource(value = {"test,4", " OtHEr ,5", "E V e n t,5", "null ,4"})
    //public void shouldCalculateStringLengthWithoutSpaces(String input, int expected){
    //        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
     //       }

    //@ParameterizedTest
    //@MethodSource(value = "provideStringsForTestingLength")
    //public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
    //    assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    //}

    @ParameterizedTest //wersja 7.3. Obiekty jako dane wejściowe
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3"}, delimiter = ':')
            public void shouldCountNumberOfCommas(String input, int expected){
            assertEquals(expected, manipulator.countNumberOfCommas(input));
            }
}