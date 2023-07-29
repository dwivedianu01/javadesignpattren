package com.learn.pattern;

import java.util.HashMap;
/*From here if any vehicle type alreay exist than returns from map no needs to create new one.
 */

public class VehicleFactory {

    HashMap<String, Vehicle> vehicles = new HashMap<>();

    public Vehicle getVehicle(String type) {
        Vehicle v = null;

        if (vehicles.containsKey(type)) {
            v =  vehicles.get(type);
        } else {
            switch (type) {
                case "truck":
                    v =  new Truck();
                    break;
                case "bus":
                    v =  new Bus();
                    break;
                case "car":
                    v =  new Car();
                    break;
                case "bike":
                    v =  new Bike();
                    break;
                case "cycle":
                    v =  new Cycle();
                    break;
                default:
                    throw new RuntimeException("Bad vehicle type");
            }
            vehicles.put(type,v);
        }
        return v;

    }


}
