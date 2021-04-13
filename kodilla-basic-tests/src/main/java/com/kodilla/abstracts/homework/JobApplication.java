package com.kodilla.abstracts.homework;

public class JobApplication {

    public static void main(String[] args) {

        Job cleaner = new CleanerJob(3250, "cleaning");
        Job manager = new ManagerJob(5890, "managing");


        Person janush = new Person("Janusz",35, cleaner);
        Person maryan = new Person("Marian", 55, manager);

        janush.showResponsibilities();
        maryan.showResponsibilities();

    }
}
