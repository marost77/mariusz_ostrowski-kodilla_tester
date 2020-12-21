package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder("1/12");
        warehouse.addOrder("2/12");
        warehouse.addOrder("6/11");
        warehouse.addOrder("5/11");

        String orderNoToCheck = "9/12";
        try {
            if (warehouse.getOrder(orderNoToCheck).getNumber() == orderNoToCheck) {
                System.out.println("Order is valid in warehouse");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Order");
        }



    }
}
