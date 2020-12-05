package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("^^^^^^^^^^^^^^^^^^");
        System.out.println(getCarName(car));

    }

    private static String getCarName (Car car){
        if (car instanceof Ferrari)
            return "Ferrari";
        if (car instanceof Toyota)
            return "Toyota";
        if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car name";
    }
}
