package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrueIfWeightBelow30(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Assertions.assertTrue(bean.deliverPackage("test street", 29.9));
    }

    @Test
    public void shouldReturnFalseIfWeightAbove30(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Assertions.assertFalse(bean.deliverPackage("test street", 30.1));
    }

    @Test
    public void shouldNotifyFailureDelivery(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        NotificationService bean = context.getBean(NotificationService.class);
        Assertions.assertNotNull(bean.fail("test"));
    }

    @Test
    public void shouldNotifySuccessDelivery(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        NotificationService bean = context.getBean(NotificationService.class);
        Assertions.assertNotNull(bean.success("test"));
    }

    @Test
    public void shouldNotifySuccessDeliveryShippingCenter(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testAddress = "Test Street 1";
        Assertions.assertEquals("Package delivered to: "+testAddress,bean.sendPackage(testAddress, 29.1));

    }

    @Test
    public void shouldNotifyFailDeliveryShippingCenter(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String testAddress = "Test Street 1";
        Assertions.assertEquals("Package not delivered to: "+testAddress, bean.sendPackage(testAddress, 30.1));
    }
}