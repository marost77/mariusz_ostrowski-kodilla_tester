package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{

    int speed;
    int accelerate;
    int brake;

    public Toyota(int accelerate, int brake){
        this.accelerate = accelerate;
        this.brake = brake;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + accelerate;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - brake;
    }
}
