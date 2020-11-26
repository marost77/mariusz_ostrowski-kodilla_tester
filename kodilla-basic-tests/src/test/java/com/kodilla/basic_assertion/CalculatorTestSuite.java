package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int result = calculator.sum(a, b);
        assertEquals(13, result);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int result = calculator.subtract(a, b);
        assertEquals(-3, result);
    }

    @Test
    public void testSq() {
        Calculator calculator = new Calculator();
        int a = (-5);
        int result = calculator.squared(a);
        assertEquals(25, result);
    }

}
