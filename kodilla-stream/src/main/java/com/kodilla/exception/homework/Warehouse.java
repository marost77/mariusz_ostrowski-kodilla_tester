package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    List<Order> orderList = new ArrayList<>();

    public void addOrder(String orderNo){
            orderList.add(new Order(orderNo));
    }

    public List<Order> getOrder(String number)  throws OrderDoesntExistException{

        List existingOrder = orderList
                .stream()
                .filter(order -> order.getNumber() == number)
                //.map(order -> order.getNumber())
                .collect(Collectors.toList());
        if (existingOrder.size()==0) {
            throw new OrderDoesntExistException();
        }
        else
        return existingOrder;
    }

   // public Boolean isOrderValid(String number) throws OrderDoesntExistException {
     //   if (orderList.contains(number))
    //        return true;
     //   throw new OrderDoesntExistException();
  //  }



}
