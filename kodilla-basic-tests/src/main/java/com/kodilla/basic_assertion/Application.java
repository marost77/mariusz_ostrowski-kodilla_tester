package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);

        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
            System.out.println(("Metoda substract działa poprawnie dla liczb " + a + " i " + b));
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int substrResult = calculator.subtract(a,b);
        boolean correctSubst = ResultChecker.assertEquals(-3, substrResult);
        if (correctSubst) {
            System.out.println(("Metoda substract działa poprawnie dla liczb " + a + " i " + b));
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squaredResult = calculator.squared(a);
        boolean correctSquare = ResultChecker.assertEquals(25, squaredResult);
        if (correctSubst) {
            System.out.println(("Metoda squared działa poprawnie dla liczb " + a));
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczb " + a);
        }

    }


}
