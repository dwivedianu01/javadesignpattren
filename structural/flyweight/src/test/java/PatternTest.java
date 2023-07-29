import com.learn.pattern.Vehicle;
import com.learn.pattern.VehicleFactory;

/*
Fly weight pattern is part of structural design pattern group.
####When we should use
1. Wants to create multiple similar project.
2. Object has maximum similar properties only some are different.
3. Object creation is costly (time and memory)

Every object has two types of properties.
1. Intrinsic - Return Fix fields value, value will not change for different objects. these are immutable means value will not change.
2. Extrinsic - Passed at object creation time



 */
public class PatternTest {

    public static void main(String a[]){

        Vehicle truck = new VehicleFactory().getVehicle("truck");
        truck.setColor("Red");
        truck.startEngine();

        Vehicle bus = new VehicleFactory().getVehicle("bus");
        bus.setColor("Yellow");
        bus.startEngine();

        Vehicle car = new VehicleFactory().getVehicle("car");
        car.setColor("Orange");
        car.startEngine();

        Vehicle bike = new VehicleFactory().getVehicle("bike");
        bike.setColor("Green");
        bike.startEngine();

        Vehicle cycle = new VehicleFactory().getVehicle("cycle");
        cycle.setColor("Blue");
        cycle.startEngine();

    }

}
