package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        int speed = 0;

        Car f480  = new Ferrari(10, 8);
        doRace(f480);
        System.out.println("car speed: "+f480.getSpeed());

        Car gt = new Ford(8,7);
        doRace(gt);
        System.out.println("car speed: "+gt.getSpeed());

        Car supra = new Toyota(7,6);
        doRace(supra);
        System.out.println("car speed: "+supra.getSpeed());

        }




        public static void doRace (Car car){
            car.increaseSpeed();
            car.increaseSpeed();
            car.increaseSpeed();
            car.decreaseSpeed();
            car.decreaseSpeed();

        }




}
