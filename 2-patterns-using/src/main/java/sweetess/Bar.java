package sweetess;

public class Bar extends Sweetness {

    public Bar(double weight, double sugarLevel, String name) {
        this.setSugarLevel(sugarLevel);
        this.setWeight(weight);
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Bar{" +
                this.getName() + ", " +
                this.getWeight() + ", " +
                this.getSugarLevel() + "}";
    }
}
