package com.kodilla.inheritance.homework;

public class OperatingSystemTest {

    public static void main(String[] args) {

        Win10 win10 = new Win10("John");
        win10.turnOn();
        win10.login();
        win10.turnOff();


        Dos dos = new Dos("Norton Commander");
        dos.turnOn();
        dos.runProgram();
        dos.turnOff();

    }
}
