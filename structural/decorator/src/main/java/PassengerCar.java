public class PassengerCar extends DecoratCar{

    public PassengerCar(Car car) {
        super(car);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Passenger Car designed");
    }
}
