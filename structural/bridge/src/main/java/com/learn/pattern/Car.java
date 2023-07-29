package com.learn.pattern;

public class Car extends Manufacture {

    public Car(Workshop ws1, Workshop ws2) {
        super(ws1, ws2);
    }

    @Override
    public void order() {
        System.out.print("\nCar");
        produce.work();
        assemble.work();
    }
}
