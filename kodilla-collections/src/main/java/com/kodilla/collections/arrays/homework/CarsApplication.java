package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {


    public static void main(String[] args) {
        Random random = new Random();
        int qty = random.nextInt(15)+1;
        Car[] carsList = new Car[qty];
        for (int i = 0; i < carsList.length; i++) {
            carsList[i] = drawCar();
        }
        for (Car car : carsList){
            CarUtils.describeCar(car);
        }

    }

    public static Car drawCar(){
        Random random = new Random();
        int drawCarName = random.nextInt(3);
        int accelerate = random.nextInt(10) + 1;
            if (drawCarName == 0) return new Ferrari(accelerate, 8);
            if (drawCarName == 1) return new Ford(accelerate, 6);
            else return new Toyota(accelerate,7);
    }
}
