package com.learn.pattern;

public class Computer {
    String name;
    String email;
    String city;
    int houseNumber;

    public Computer(String name, String email, String city, int houseNumber) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
