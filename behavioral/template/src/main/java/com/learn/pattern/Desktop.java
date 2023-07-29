package com.learn.pattern;

import java.util.Arrays;

public class Desktop extends Computer {
    @Override
    public void getOrder() {
        System.out.println("Desktop Order Received");
    }

    @Override
    public void ExtraParts(String ... parts) {
        System.out.println("Get Extra Order parts - "+ Arrays.asList(parts));

    }

    @Override
    public void assembleComputer() {
        System.out.println("Desktop Assembled");

    }

    @Override
    public void deliver() {
        System.out.println("Desktop Tested & delivered Successfully");
    }
}
