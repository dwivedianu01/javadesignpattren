import com.learn.pattern.ComputerFactory;
/*
This pattern part of Creational Design Pattern group
Create class object without knowing type or any thing.
Get Object from Factory
 */
public class PatternTest {

    public static void main(String a[]){
        ComputerFactory cf = new ComputerFactory();
        cf.getComputer("desktop").getComputer();
        cf.getComputer("laptop").getComputer();
        cf.getComputer("server").getComputer();
        cf.getComputer("bad").getComputer();

    }
}
