package com.learn.pattern;

public class Bus implements Vehicle {
    private String color;
    private final String engineCapacity = "2500cc";

    @Override
    public void startEngine() {
        System.out.println("Bus of color " + color + " : started , engine capacity : " + engineCapacity);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
