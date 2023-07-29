package com.learn.pattern;

public class LaptopFactory implements Factory{
    @Override
    public Device getDetail(DeviceType deviceType) {
        switch (deviceType) {
            case DELL:
                return new Dell(buildDeviceEntity("8GB", "intel", "64GB"),"cpu-dell");
            case HP:
                return new HP(buildDeviceEntity("10GB", "intel", "128GB"),"cpu-hp");
            case IBM:
                return new Ibm(buildDeviceEntity("12GB", "intel", "256GB"),"cpu-ibm");
        }
        return null;

    }

    private DeviceEntity buildDeviceEntity(String ram,String processor, String storage){
        DeviceEntity deviceEntity = new DeviceEntity();
        deviceEntity.setRam(ram);
        deviceEntity.setProcessor(processor);
        deviceEntity.setStorage(storage);
        return deviceEntity;
    }

}
