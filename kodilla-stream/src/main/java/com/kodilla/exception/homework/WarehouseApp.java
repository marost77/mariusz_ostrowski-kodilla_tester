package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args)  {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder("1/12");
        warehouse.addOrder("2/12");
        warehouse.addOrder("6/11");
        warehouse.addOrder("5/11");

        String orderNoToCheck = "3/12";

        try {
            warehouse.getOrder(orderNoToCheck);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry order: "+orderNoToCheck+" doesnt exist");;
        }
        // warehouse.isOrderValid(orderNoToCheck);


    }
}
