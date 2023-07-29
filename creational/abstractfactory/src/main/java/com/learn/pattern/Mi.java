package com.learn.pattern;

public class Mi implements Device{
    private DeviceEntity deviceEntity;

    public Mi(DeviceEntity deviceEntity) {
        this.deviceEntity = deviceEntity;
    }

    @Override
    public String getSpecification() {

        return "Device MI: ram is "+deviceEntity.getRam()+" : storage is "+deviceEntity.getStorage()+" : processor is "+deviceEntity.getProcessor();
    }
}
