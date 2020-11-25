package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int prodYear;

    public OperatingSystem(int prodYear){
        this.prodYear=prodYear;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void turnOn(){
        System.out.println("System is ON");
    }

    public void turnOff(){
        System.out.println("Thank you for using our system. System is OFF");

    }
}
