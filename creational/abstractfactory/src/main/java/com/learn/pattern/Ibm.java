package com.learn.pattern;

public class Ibm implements Device{
    private DeviceEntity deviceEntity;
    private String cpu;

    public Ibm(DeviceEntity deviceEntity, String cpu) {
        this.deviceEntity = deviceEntity;
        this.cpu = cpu;
    }

    @Override
    public String getSpecification() {

        return "Device Ibm: ram is "+deviceEntity.getRam()+" : storage is "+deviceEntity.getStorage()+
                " : processor is "+deviceEntity.getProcessor()+" : cpu "+this.cpu;
    }
}
