package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"abcd,true","ABCD,true","AbCd,true","A0b9,true","A.b-,true","A_b0,true",
    "ab,false","0,false","B0,false","-,false"})
    public void shouldValidateUserNames(String input,boolean expected){
        assertEquals(expected, userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"+@aA.a","a#A.c","A@1.0","aAa@bbb."})
    public void shouldValidateEmails (String emailAddress){
        assertFalse(userValidator.validateEmail(emailAddress));
    }
}
