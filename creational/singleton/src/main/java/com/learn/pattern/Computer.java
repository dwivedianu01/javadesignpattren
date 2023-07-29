package com.learn.pattern;

public class Computer {
    private static Computer computer;

    private Computer() {

    }

    public static Computer getInstance() {
        if (computer == null) {
            computer = new Computer();
            System.out.println("Instance is null");
        }
        System.out.println("Instance is ready");

        return computer;
    }

}
