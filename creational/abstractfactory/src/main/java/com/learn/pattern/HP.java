package com.learn.pattern;

public class HP implements Device{
    private DeviceEntity deviceEntity;
    private String cpu;

    public HP(DeviceEntity deviceEntity, String cpu) {
        this.deviceEntity = deviceEntity;
        this.cpu = cpu;
    }

    @Override
    public String getSpecification() {
        return "Device HP: ram is "+deviceEntity.getRam()+" : storage is "+
                deviceEntity.getStorage()+" : processor is "+deviceEntity.getProcessor()+" : cpu "+this.cpu;
    }
}
