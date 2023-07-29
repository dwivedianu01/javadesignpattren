package com.learn.pattern;

public class EngineAdapter implements Engine {
    IndicaOldCar indicaOldCar = new IndicaOldCar();
    @Override
    public String getEngine() {
        return indicaOldCar.engine();
    }
}
