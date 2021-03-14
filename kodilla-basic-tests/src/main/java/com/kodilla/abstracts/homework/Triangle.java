package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    private double a;
    private double h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public void area() {
        System.out.println("Area is "+(0.5*a*h));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is "+(3*a));
    }
}
