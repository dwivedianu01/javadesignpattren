package com.learn.pattern;

public class Cycle implements Vehicle {
    private String color;
    private final String engineCapacity = "0cc";


    @Override
    public void startEngine() {
        System.out.println("Cycle of color " + color + " : started , engine capacity : " + engineCapacity);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
