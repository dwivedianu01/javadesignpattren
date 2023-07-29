package com.learn.pattern;

public abstract class Computer {

    public abstract void getOrder();
    public void getInitialParts(){
        System.out.println("Get 32 GB RAM, 1TB Hard disk, Intel Processor");
    }
    public abstract void ExtraParts(String ... parts);
    public abstract void assembleComputer();
    public abstract void deliver();
    public final void processOrder(String ... parts){
        getOrder();
        getInitialParts();
        ExtraParts(parts);
        assembleComputer();
        deliver();

    }

}
