package com.kodilla.spring.basic.dependency_injection.homework;

public class FailNotificationService implements NotificationService{
    @Override
    public void send(String address) {
        System.out.println("FAIL to deliver to address "+address);
    }
}
