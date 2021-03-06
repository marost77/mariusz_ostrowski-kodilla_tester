package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideDataForPerson(){
        return Stream.of(
                Arguments.of(1.8,48, "Very severely underweight"),
                Arguments.of(1.8,51,"Severely underweight"),
                Arguments.of(1.8,59,"Underweight"),
                Arguments.of(1.8,80,"Normal (healthy weight)"),
                Arguments.of(1.8,94, "Overweight"),
                Arguments.of(1.8,113,"Obese Class I (Moderately obese)"),
                Arguments.of(1.8,128,"Obese Class II (Severely obese)"),
                Arguments.of(1.8,145,"Obese Class III (Very severely obese)"),
                Arguments.of(1.8,161,"Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.7,173, "Obese Class V (Super Obese)"),
                Arguments.of(1.7,175, "Obese Class VI (Hyper Obese)")
        );
    }
}
