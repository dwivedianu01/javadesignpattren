package com.learn.pattern;

public class Bike implements Vehicle {
    private String color;
    private final String engineCapacity = "150cc";


    @Override
    public void startEngine() {
        System.out.println("Bike of color " + color + " : started , engine capacity : " + engineCapacity);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
