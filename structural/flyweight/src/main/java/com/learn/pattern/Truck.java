package com.learn.pattern;

public class Truck implements Vehicle {

    private String color;
    private final String engineCapacity = "3500cc";


    @Override
    public void startEngine() {
        System.out.println("Truck of color " + color + " : started , engine capacity : " + engineCapacity);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }


}
