package com.learn.pattern;

public class ComputerFactory {

    public Computer getComputer(String type){
        switch (type)
        {
            case "desktop":
                return new Desktop();
            case "laptop":
                return new Laptop();
            case "server":
                return new Server();
            default:
                return null;
        }


    }



}
