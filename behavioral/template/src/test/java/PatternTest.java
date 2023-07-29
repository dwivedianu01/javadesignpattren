import com.learn.pattern.Computer;
import com.learn.pattern.Desktop;
import com.learn.pattern.Laptop;

/*
Behavioral Design Patter:
Behavioral Design Patterns offer solution for the better interaction between objects
and how to provide lose coupling and flexibility to extend easily.
Template Design Patter:
You can use template design pattern where some methods have
common implementation and some depend upon sub classes.
Example:
   Shop of Computer:
         Which has common method getParts: (32GB RAM, 1TB HD, intel Processor).
         But Other feature depend upon customer what he want - Monitor, Mouse, Keyboard, External HD etc
   So here we will create one abstract class which will have common methods other methods will implement in subclasses.

*/
public class PatternTest {
    public static void main(String[] a) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        laptop.processOrder("Wifi Mouse", "1TB External Hard disk", "4 GB Memory Card");
        System.out.println("**************************************************************");
        desktop.processOrder("Wired Mouse", "External Keyboard", "16 GB Memory Card");
    }

}
