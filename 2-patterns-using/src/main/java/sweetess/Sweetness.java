package sweetess;

public abstract class Sweetness{
    private double weight;
    private double sugarLevel;
    private String name;

    public double getWeight() {
        return weight;
    }

    public double getSugarLevel() {
        return sugarLevel;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSugarLevel(double sugarLevel) {
        this.sugarLevel = sugarLevel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sweetness{" +
                "weight=" + weight +
                ", sugarLevel=" + sugarLevel +
                ", name='" + name + '\'' +
                '}';
    }
}
