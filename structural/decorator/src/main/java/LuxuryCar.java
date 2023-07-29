public class LuxuryCar extends DecoratCar{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Luxury Car designed");
    }
}
