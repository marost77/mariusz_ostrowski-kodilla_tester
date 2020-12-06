package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Ferrari(10, 8));
        carList.add(new Ford(9, 9));
        carList.add(new Toyota(8, 7));

        for (Car car : carList) {
            CarUtils.describeCar(car);
        }

        carList.remove(0);
        Car supra = new Toyota(6,6);
        carList.add(supra);
        carList.remove(supra);

        System.out.println("----------After change---------");
        System.out.println(carList.size());

        for (Car car : carList) {
            CarUtils.describeCar(car);

        }
    }
}