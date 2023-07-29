/*
This pattern is part of structural design pattern.
1. Decorator patterns allow a user to add new functionality to an existing object without altering its structure. So, there is no change to the original class.
2. The decorator design pattern uses abstract classes or interfaces with the composition to implement the wrapper.
3. Decorator design patterns are most frequently used for applying single responsibility principles since we divide the functionality into classes with unique areas of concern.
4. The decorator design pattern is structurally almost like the chain of responsibility pattern.
5. Decorator design patterns create decorator classes, which wrap the original class and supply additional functionality by keeping the class methods’ signature unchanged.
6. The decorator design pattern is a structural pattern, This will provide a wrapper to the existing class.

Java CLass Example:
example is Buffered classes like BufferedReader and BufferedWriter which enhances Reader and Writer objects to perform Buffer level
reading and writing for improved performance

 */
public class PatternTest {
    public static void main(String args[]){

        BasicCar basicCar = new BasicCar();
        basicCar.design();

        PassengerCar passengerCar = new PassengerCar(basicCar);
        passengerCar.design();

        LuxuryCar luxuryCar = new LuxuryCar(basicCar);
        luxuryCar.design();

    }
}
