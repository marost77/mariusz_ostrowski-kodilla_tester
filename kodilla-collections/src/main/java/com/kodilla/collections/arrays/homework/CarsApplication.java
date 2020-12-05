package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {


    public static Car drawCar(){
        Random random = new Random();
        int drawCarName = random.nextInt(3);
        int accelerate = random.nextInt() * 10 + 1;
            if (drawCarName == 0) return new Ferrari(accelerate);
            if (drawCarName == 1) return new Ford();
            else return new Toyota();
    }
}
