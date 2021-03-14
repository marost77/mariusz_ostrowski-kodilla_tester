package com.kodilla.abstracts.homework;

public class JobApplication {

    public static void main(String[] args) {


        Person janush = new Person(3250, "cleaning", "Janusz");
        Person maryan = new Person(5890, "managing", "Marian");

        janush.showResponsibilities();
        maryan.showResponsibilities();

    }
}
