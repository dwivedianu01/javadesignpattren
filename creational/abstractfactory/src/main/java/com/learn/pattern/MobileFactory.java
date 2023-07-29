package com.learn.pattern;

public class MobileFactory implements Factory{
    @Override
    public Device getDetail(DeviceType deviceType) {
        switch (deviceType) {
            case MI:
                return new Mi(buildDeviceEntity("1GB", "intel", "64GB"));
            case ONEPLUS:
                return new Mi(buildDeviceEntity("2GB", "intel", "128GB"));
            case SAMSUNG:
                return new Mi(buildDeviceEntity("3GB", "intel", "256GB"));
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
