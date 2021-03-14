package com.kodilla.abstracts.homework;

public class Person extends Job{
    private String firstName;

    public Person(double salary, String responsibilities, String firstName) {
        super(salary, responsibilities);
        this.firstName=firstName;
    }


    public void showResponsibilities(){
        System.out.println("Person "+firstName+" responsibilities are: "+responsibilities);
    }




}
