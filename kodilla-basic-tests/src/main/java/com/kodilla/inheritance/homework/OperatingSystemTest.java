package com.kodilla.inheritance.homework;

public class OperatingSystemTest {

    public static void main(String[] args) {

        Win10 win10 = new Win10("John");
        win10.turnOn();
        System.out.println("Production year: "+win10.getProdYear());
        win10.login();
        win10.turnOff();


        Dos dos = new Dos("Norton Commander");
        dos.turnOn();
        System.out.println("Production year: "+dos.getProdYear());
        dos.runProgram();
        dos.turnOff();

    }
}
