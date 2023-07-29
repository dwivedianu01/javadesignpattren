package com.learn.pattern;

public class Bus extends Manufacture {

    public Bus(Workshop ws1, Workshop ws2) {
        super(ws1, ws2);
    }

    @Override
    public void order() {
        System.out.print("\nBus");
        produce.work();
        assemble.work();
    }
}
