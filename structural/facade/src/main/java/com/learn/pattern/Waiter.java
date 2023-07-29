package com.learn.pattern;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
public class Waiter {

    public static void orderFood(FoodType foodType) {
        switch(foodType) {
            case NORTHINDIAN:
                Food northIndian = new NorthIndian();
                System.out.println(northIndian.prepareFood("Dal","Paneer","Mix-Veg"));
                System.out.println(northIndian.deliverFood());
             break;
            case SOUTHINDIAN:
                Food southIndian = new SouthIndian();
                System.out.println(southIndian.prepareFood("Idaly","Vada","Sambhar"));
                System.out.println(southIndian.deliverFood());
                break;
            case CHINESE:
                Food chinese = new Chinese();
                System.out.println(chinese.prepareFood("Noodles","Soup","Chicken Noodles"));
                System.out.println(chinese.deliverFood());
                break;
            case ITALIAN:
                Food itaian = new Italian();
                System.out.println(itaian.prepareFood("Pizza","Pasta","Spinach Pasta"));
                System.out.println(itaian.deliverFood());
                break;
            default:
                throw new RuntimeException("Wrong choice");


        }
    }


}
