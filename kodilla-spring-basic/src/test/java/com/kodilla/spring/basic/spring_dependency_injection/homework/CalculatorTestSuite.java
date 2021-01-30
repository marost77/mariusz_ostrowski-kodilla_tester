package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldDisplaySomething() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        double result = bean.display(1.25);
        Assertions.assertNotNull(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"-11.54, -6.79, -18.33", "-32.28, 125.62, 93.34", "4, 16, 20", "457.47, 1238.23, 1695.70"})
    public void calculatorShouldAdd(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(expected, bean.add(a, b));
    }

    @ParameterizedTest
    @CsvSource(value = {"-11.50, -6.75, -4.75", "-32.28, 125.62, -157.9", "4, 16, -12", "457.47, 1238.23, -780.76"})
    public void calculatorShouldSubstract(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(expected, bean.subtract(a, b));
    }

    @ParameterizedTest
    @CsvSource(value = {"-11.50, -6.75, 77.625", "-32.28, 125.62, -4055.0136", "4, 16, 64", "457.47, 1238.23, 566453.0781"})
    public void calculatorShoulMultiply(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(expected, bean.multiply(a, b));
    }

    @ParameterizedTest
    @CsvSource(value = {"-11.50, -6.75, 1.7037037037037037", "-32.28, 125.62, -0.2569654513612482", "4, 16, 0.25", "457.47, 1238.23, 0.36945478626749473"})
    public void calculatorShoulDivide(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(expected, bean.divide(a, b));
    }

}
