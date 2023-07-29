package com.learn.pattern;


public class FactoryProvider implements DeviceFactory {

    public Factory getFactory(DeviceFactoryType deviceFactoryType) {
        switch (deviceFactoryType) {
            case COMPUTER:
                return new LaptopFactory();
            case MOBILE:
                return new MobileFactory();
        }
        return null;

    }


}
