package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryService deliveryService;

    public ShippingCenter(DeliveryService deliveryService){
        this.deliveryService = deliveryService;
    }

    public void sendPackage(String address, double weight) {
        if (DeliveryService.deliverPackage(address, weight)) {
            new SuccessNotificationService().send(address);
        } else {
            new FailNotificationService().send(address);
        }
    }
}