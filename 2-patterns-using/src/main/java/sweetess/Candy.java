package sweetess;

public class Candy extends Sweetness {

    public Candy(double weight, double sugarLevel, String name) {
        this.setSugarLevel(sugarLevel);
        this.setWeight(weight);
        this.setName(name);
    }


    @Override
    public String toString() {
        return "Candy{" +
                this.getName() + ", " +
                this.getWeight() + ", " +
                this.getSugarLevel() + "}";
    }
}
