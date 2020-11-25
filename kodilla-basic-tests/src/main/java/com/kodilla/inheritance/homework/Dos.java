package com.kodilla.inheritance.homework;

public class Dos extends OperatingSystem{
    String program;

    public Dos(String program){
        super(1982);
        this.program=program;

    }


    public void runProgram(){

        System.out.println("Executing program: "+program);

    }

}
