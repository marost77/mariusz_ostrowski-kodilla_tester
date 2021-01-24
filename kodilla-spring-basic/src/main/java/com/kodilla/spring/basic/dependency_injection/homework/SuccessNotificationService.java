package com.kodilla.spring.basic.dependency_injection.homework;

public class SuccessNotificationService implements NotificationService {
    @Override
    public void send(String address) {
        System.out.println("Delivery to address "+address+" was succesful.");
    }
}
