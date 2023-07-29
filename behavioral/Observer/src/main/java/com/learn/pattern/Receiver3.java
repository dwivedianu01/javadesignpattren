package com.learn.pattern;

import java.util.Observable;
import java.util.Observer;

public class Receiver3 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            System.out.println("Receiver 3 Listening"+ (String) arg);
        }
    }
}
