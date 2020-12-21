package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    List<Order> orderList = new ArrayList<>();

    public List<Order> addOrder(String orderNo){
            orderList.add(new Order(orderNo));
    return orderList;
    }

    public Order getOrder(String number){

        Order existingOrder = orderList
                .stream()
                .filter(order -> order.getNumber() == number)
                .findAny()
                .get();

        return existingOrder;
    }

}
