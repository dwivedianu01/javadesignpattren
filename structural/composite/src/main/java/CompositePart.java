import java.util.ArrayList;
import java.util.List;

public class CompositePart implements Part {
    private String name;
    private List<IndividualPart> individualParts = new ArrayList<>();

    public CompositePart(String name, List<IndividualPart> individualParts) {
        this.name = name;
        this.individualParts = individualParts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IndividualPart> getParts() {
        return individualParts;
    }

    public void setParts(List<IndividualPart> individualParts) {
        this.individualParts = individualParts;
    }

    @Override
    public void showPrice(){
        int totalPrice = 0;
        for(IndividualPart individualPart :this.individualParts){
            totalPrice = totalPrice +individualPart.getCost();
        }
        System.out.println(this.getName()+" : "+ totalPrice);

    }

    public void addPart(IndividualPart individualPart){
        this.individualParts.add(individualPart);
    }
}
