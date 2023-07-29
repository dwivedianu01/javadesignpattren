package com.learn.pattern;

public class Dell implements Device{
    private DeviceEntity deviceEntity;
    private String cpu;

    public Dell(DeviceEntity deviceEntity, String cpu) {
        this.deviceEntity = deviceEntity;
        this.cpu = cpu;
    }

    @Override
    public String getSpecification() {

        return "Device Dell: ram is "+deviceEntity.getRam()+" : storage is "+deviceEntity.getStorage()+
                " : processor is "+deviceEntity.getProcessor()+" : cpu "+this.cpu;
    }
}
