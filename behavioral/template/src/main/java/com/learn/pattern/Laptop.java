package com.learn.pattern;

import java.util.Arrays;

public class Laptop extends Computer {

    @Override
    public void getOrder() {
        System.out.println("Laptop Order Received");
    }

    @Override
    public void ExtraParts(String ... parts) {
        System.out.println("Get Extra Order parts - "+ Arrays.asList(parts));

    }

    @Override
    public void assembleComputer() {
        System.out.println("Laptop Assembled");

    }

    @Override
    public void deliver() {
        System.out.println("Laptop Tested & delivered Successfully");
    }
}
