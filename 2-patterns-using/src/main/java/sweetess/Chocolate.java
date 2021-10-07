package sweetess;

public class Chocolate extends Sweetness {

    public Chocolate(double weight, double sugarLevel, String name) {
        this.setSugarLevel(sugarLevel);
        this.setWeight(weight);
        this.setName(name);
    }


    @Override
    public String toString() {
        return "Chocolate{" +
                this.getName() + ", " +
                this.getWeight() + ", " +
                this.getSugarLevel() + "}";
    }
}
