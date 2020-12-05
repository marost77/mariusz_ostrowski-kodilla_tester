package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    int speed = 0;
    int accelerate;
    int brake;

    public Ford(int accelerate, int brake){
        this.accelerate = accelerate;
        this.brake = brake;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() { speed = speed + accelerate;    }

    @Override
    public void decreaseSpeed() { speed = speed - brake;    }
}
