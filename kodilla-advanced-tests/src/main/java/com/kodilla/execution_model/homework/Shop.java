package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    //public void getOrdersByDate(Date from, Date until){
        //orderList.stream()
             //   .map(order -> order.getOrderDate())
            //    .forEach(date -> date);
   // }

    public void getOrderByValue(int minValue, int maxValue){

    }

    public int ordersCount(){
       return orderList.size();
    }

    public void ordersTotalValue(){

    }

    public void countOrders (){

    }

    public void sumOrders(){

    }

    
}
