public class DecoratCar extends BasicCar{

    Car car;
    public DecoratCar(Car car) {
        this.car = car;
    }

    @Override
    public void design() {
        System.out.println(" ****************************** Going to Modified Car ****************************** ");

        super.design();
    }
}
