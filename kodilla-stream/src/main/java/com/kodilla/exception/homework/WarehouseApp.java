package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder("1/12");
        warehouse.addOrder("2/12");
        warehouse.addOrder("6/11");
        warehouse.addOrder("5/11");

        String orderNoToCheck = "1/12";

        try {
            warehouse.getOrder(orderNoToCheck);
            System.out.println("Order "+orderNoToCheck+" exists in warehouse");
        } catch (OrderDoesntExistException e) {
            System.out.println("Wrong order number");
        }
        finally {
            System.out.println("Good bye");
        }


    }
}
