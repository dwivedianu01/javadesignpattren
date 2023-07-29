package com.learn.pattern;

public class OnePlus implements Device{
    private DeviceEntity deviceEntity;

    public OnePlus(DeviceEntity deviceEntity) {
        this.deviceEntity = deviceEntity;
    }

    @Override
    public String getSpecification() {

        return "Device OnePlus: ram is "+deviceEntity.getRam()+" : storage is "+deviceEntity.getStorage()+" : processor is "+deviceEntity.getProcessor();
    }
}
