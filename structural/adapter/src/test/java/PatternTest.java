import com.learn.pattern.BuildCar;
import com.learn.pattern.Engine;
import com.learn.pattern.EngineAdapter;
import com.learn.pattern.TataPartsFactory;
/*
Adapter is Part of Structural Pattern. This is bridge between two incompatible Interfaces.
In this example we wants to build Tata car with all new parts and features but wants to use legacy Indica car engine.
So we created bridge between old Engine file to new interface and use that.
 */
public class PatternTest {
    public static void main(String a[]){
        BuildCar buildCar = new BuildCar();
        TataPartsFactory tataPartsFactory = new TataPartsFactory("new-body","new-gear","new-mirrors");
        buildCar.setParts(tataPartsFactory);
        Engine oldEngine = new EngineAdapter();
        buildCar.setEngine(oldEngine);
        System.out.println(buildCar);
        System.out.println(buildCar.getEngine().getEngine());


    }
}
