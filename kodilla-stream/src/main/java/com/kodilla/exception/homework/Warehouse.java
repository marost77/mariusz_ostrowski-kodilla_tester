package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    List<Order> orderList = new ArrayList<>();

    public List<Order> addOrder(String orderNo){
            orderList.add(new Order(orderNo));
    return orderList;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {

        Order existingOrder = orderList
                .stream()
                .filter(order -> order.getNumber() == number)
                .findAny()
                .get();

        if (orderList.contains(existingOrder)) return existingOrder;
        throw new OrderDoesntExistException();

    }

   // public Boolean isOrderValid(String number) throws OrderDoesntExistException {
    //    if (getOrder(number).getNumber()==number)
    //       return true;
        //orderList.contains(getOrder(number));
     //  throw new OrderDoesntExistException();
   // }


}
