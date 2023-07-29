package com.learn.pattern;

import java.util.Observable;
import java.util.Observer;

public class Notification extends Observable implements Runnable{
    @Override
    public void run() {
        notifyObservers("Process Started");

    }
}
