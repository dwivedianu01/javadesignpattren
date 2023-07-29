import com.learn.pattern.Chinese;
import com.learn.pattern.Food;
import com.learn.pattern.FoodType;
import com.learn.pattern.Italian;
import com.learn.pattern.NorthIndian;
import com.learn.pattern.SouthIndian;
import com.learn.pattern.Waiter;

/*
This Facade pattern is part of structural design pattern group.
This is one of my favourite java design pattern.
This hides complexity of system from client.

Where to use:
Developers often use the facade design pattern when a
system is very complex or difficult to understand because
the system has many interdependent classes or because
its source code is unavailable.
 */
public class PatternTest {
    public static void main(String a[]){

       System.out.println("---------Facade-----------");
       Waiter.orderFood(FoodType.NORTHINDIAN);
       Waiter.orderFood(FoodType.SOUTHINDIAN);
       Waiter.orderFood(FoodType.CHINESE);
       Waiter.orderFood(FoodType.ITALIAN);

    }
}
