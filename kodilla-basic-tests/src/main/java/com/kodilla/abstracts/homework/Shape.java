package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int a;
    private int b;

    public Shape(int a,int b){
        this.a=a;
        this.b=b;
    }

    public abstract void area();
    public abstract void perimeter();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
