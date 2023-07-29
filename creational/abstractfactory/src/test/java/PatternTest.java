import com.learn.pattern.DeviceFactoryType;
import com.learn.pattern.DeviceType;
import com.learn.pattern.Factory;
import com.learn.pattern.FactoryProvider;

/**
 * Abstract Factory Pattern also part of Creation Design Pattern.
 * This is called factory of Factory
 *
 * We have two factories and we can call method of any factory.
 *
 */
public class PatternTest {
    public static void main(String a[]){
        Factory laptopFactory = new FactoryProvider().getFactory(DeviceFactoryType.COMPUTER);
        System.out.println(laptopFactory.getDetail(DeviceType.DELL).getSpecification());
        System.out.println(laptopFactory.getDetail(DeviceType.HP).getSpecification());
        System.out.println(laptopFactory.getDetail(DeviceType.IBM).getSpecification());
        //System.out.println(laptopFactory.getDetail(DeviceType.MI).getSpecification());

        Factory mobileFactory = new FactoryProvider().getFactory(DeviceFactoryType.MOBILE);
        System.out.println(mobileFactory.getDetail(DeviceType.MI).getSpecification());
        System.out.println(mobileFactory.getDetail(DeviceType.ONEPLUS).getSpecification());
        System.out.println(mobileFactory.getDetail(DeviceType.SAMSUNG).getSpecification());





    }
}
