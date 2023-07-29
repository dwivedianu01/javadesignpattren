package com.learn.pattern;

public class Truck extends Manufacture {

    public Truck(Workshop ws1, Workshop ws2) {
        super(ws1, ws2);
    }

    @Override
    public void order() {
        System.out.print("\nTruck");
        produce.work();
        assemble.work();
    }
}
