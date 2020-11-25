package com.kodilla.inheritance.homework;

public class Win10 extends OperatingSystem{
    String systemUser;

    public Win10(String systemUser) {
        super(2015);
        this.systemUser=systemUser;
    }

    public void login (){

        System.out.println("You are logged as: "+systemUser);

    }
}
