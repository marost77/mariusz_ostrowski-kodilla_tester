package com.kodilla.execution_model.homework;

import java.util.Date;

public class Order {

    private double orderValue;
    private Date orderDate;
    private String orderLogin;

    public Order(double orderValue, Date orderDate, String orderLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.orderLogin = orderLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getOrderLogin() {
        return orderLogin;
    }


}
