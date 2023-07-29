package com.learn.pattern;

public class Samsung implements Device{
    private DeviceEntity deviceEntity;

    public Samsung(DeviceEntity deviceEntity) {
        this.deviceEntity = deviceEntity;
    }

    @Override
    public String getSpecification() {

        return "Device Samsung: ram is "+deviceEntity.getRam()+" : storage is "+deviceEntity.getStorage()+" : processor is- "+deviceEntity.getProcessor();
    }
}
