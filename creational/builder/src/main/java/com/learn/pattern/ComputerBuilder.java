package com.learn.pattern;

public class ComputerBuilder {
    String name;
    String email;
    String city;
    int houseNumber;

    public ComputerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ComputerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public ComputerBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public ComputerBuilder setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public Computer buildComputer(){
        return new Computer(this.name, this.email, this.city, this.houseNumber);
    }
}
