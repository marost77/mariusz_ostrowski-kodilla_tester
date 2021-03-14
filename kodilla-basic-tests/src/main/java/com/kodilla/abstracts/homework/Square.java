package com.kodilla.abstracts.homework;

public class Square extends Shape{

    private double a;

    public Square(int a) {
        this.a=a;
    }

    @Override
    public void area() {
        System.out.println("Area is "+(a*a));

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is "+(4*a));

    }
}
