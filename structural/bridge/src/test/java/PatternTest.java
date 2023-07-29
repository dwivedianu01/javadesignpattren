import com.learn.pattern.Assemble;
import com.learn.pattern.Bus;
import com.learn.pattern.Car;
import com.learn.pattern.Produce;
import com.learn.pattern.Truck;
/*
This pattern also part of structural pattern.
When we want to separate implementation and abstraction then use Bridge pattern.
Here implementation meaning some thing build or dra layer
Abstraction meaning distinguish object from one another.

User will come and select value without knowing implementation.


 */

public class PatternTest {
    public static void main(String args[]){

        new Car(new Assemble(),new Produce()).order();
        new Bus(new Assemble(),new Produce()).order();
        new Truck(new Assemble(),new Produce()).order();


    }

}
