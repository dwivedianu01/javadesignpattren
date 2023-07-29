import java.util.ArrayList;

/*
This is a structural Pattern.
When we have tree structure between objects we needs to select this design pattern.

 */

public class PatternTest {
    public static void main(String a[]){
        IndividualPart piston = new IndividualPart("Piston",100);
        IndividualPart valves = new IndividualPart("Valves",200);
        IndividualPart sparkPlug = new IndividualPart("SparkPlug",300);

        piston.showPrice();
        valves.showPrice();
        sparkPlug.showPrice();

        System.out.println("/*-----------------------------------------------------*/");

        CompositePart engine = new CompositePart("Engine",new ArrayList<>());
        engine.addPart(piston);
        engine.addPart(valves);
        engine.addPart(sparkPlug);
        engine.showPrice();

        System.out.println("/*-----------------------------------------------------*/");

        IndividualPart window = new IndividualPart("Window",150);
        IndividualPart roof = new IndividualPart("Roof",168);
        IndividualPart mirror = new IndividualPart("Mirror",987);

        window.showPrice();
        roof.showPrice();
        mirror.showPrice();

        System.out.println("/*-----------------------------------------------------*/");
        CompositePart body = new CompositePart("Window",new ArrayList<>());
        body.addPart(window);
        body.addPart(roof);
        body.addPart(mirror);
        body.showPrice();






    }
}
