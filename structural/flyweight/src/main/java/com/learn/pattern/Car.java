package com.learn.pattern;

public class Car implements Vehicle {
    private String color;
    private final String engineCapacity = "1500cc";


    @Override
    public void startEngine() {
        System.out.println("Car of color " + color + " : started , engine capacity : " + engineCapacity);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
