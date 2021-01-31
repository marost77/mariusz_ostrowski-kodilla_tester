package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    // tutaj dodaj odpowiednie wstrzykiwanie zależności
    @Autowired
    //@Qualifier(value = "DeliveryService")
    private DeliveryService deliveryService;

    @Autowired
    //@Qualifier(value = "NotificationService")
    private NotificationService notificationService;

    //public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
      //  this.deliveryService = deliveryService;
        //this.notificationService = notificationService;
    //}



    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}