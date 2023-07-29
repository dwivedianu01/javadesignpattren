import com.learn.pattern.Computer;
import com.learn.pattern.ComputerBuilder;
/*
THis is part of Creational design Patter group.
Builder pattern solves the issue with large number of optional parameters
and inconsistent state by providing a way to build the object step-by-step
and provide a method that will actually return the final Object.

In this case when we are creating object no need to pass null unwanted parameters.

In Java Example:

StringBuilder builder = new StringBuilder("Temp");

String data = builder.append(1)
		.append(true)
		.append("friend")
		.toString();

 */
public class PatternTest {
    public static void main(String a[]){
        Computer computer = new ComputerBuilder()
                .setName("Anupam")
                .setEmail("anupam.dwivedi@gmail.com")
                .setCity("Chennai").buildComputer();
        System.out.println(computer);
    }



}
