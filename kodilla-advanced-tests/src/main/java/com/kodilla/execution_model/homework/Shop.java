package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void getOrdersByDate(Date from, Date until){

    }

    public void getOrderByValue(int minValue, int maxValue){

    }

    public void countOrders (){

    }

    public void sumOrders(){

    }

    
}
