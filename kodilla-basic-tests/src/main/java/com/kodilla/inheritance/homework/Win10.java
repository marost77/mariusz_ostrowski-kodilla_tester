package com.kodilla.inheritance.homework;

public class Win10 extends OperatingSystem{
    String systemUser;

    public Win10(String systemUser) {
        this.systemUser=systemUser;
    }

    public void login (){

        System.out.println("You are logged as: "+systemUser);

    }
}
