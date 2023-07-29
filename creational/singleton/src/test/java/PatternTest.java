import com.learn.pattern.Computer;
/*
Singleton Pattern is part of creational Pattern ,
Purpose: Create a Object of class only one for one context or whole application.

When do we use:
Singleton pattern focus on sharing of object in whole system.
Only one instance of a particular class is maintained in whole application which is shared by all modules.
Java.lang.Runtime is a classical example of Singleton design pattern.
Singleton pattern which is used in Runtime , Calendar and various other classes
 */
public class PatternTest {
    public static void main(String a[]){
        Computer computer = Computer.getInstance();
        Computer computer1 = Computer.getInstance();
        Computer computer2 = Computer.getInstance();
    }
}
