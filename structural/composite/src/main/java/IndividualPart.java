public class IndividualPart implements Part{
    private String name;
    private int cost;

    public IndividualPart(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void showPrice(){
        System.out.println(this.name+" : "+this.cost);
    }
}
