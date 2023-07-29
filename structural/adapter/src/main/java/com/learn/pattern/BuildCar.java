package com.learn.pattern;

public class BuildCar {
    private TataPartsFactory parts;
    private Engine engine;

    public TataPartsFactory getParts() {
        return parts;
    }

    public void setParts(TataPartsFactory parts) {
        this.parts = parts;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "BuildCar{" +
                "parts=" + parts +
                ", engine=" + engine +
                '}';
    }
}
