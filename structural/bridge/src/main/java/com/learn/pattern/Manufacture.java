package com.learn.pattern;

public abstract class Manufacture {

    Workshop produce;
    Workshop assemble;

    public Manufacture(Workshop ws1, Workshop ws2) {
        this.produce = ws1;
        this.assemble = ws2;
    }


    public abstract void order();
}
