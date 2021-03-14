package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    private double a;
    private double b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b=b;

    }

    @Override
    public void area() {
        System.out.println("Area is "+(a*b));

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is "+((2*a)+(2*b)));
    }
}
