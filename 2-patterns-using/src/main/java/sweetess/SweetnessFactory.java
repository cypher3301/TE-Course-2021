package sweetess;

public class SweetnessFactory {
    private static Sweetness sweetness;

    public static Sweetness create(String name, double weight, double sugarLevel) {
        if (name.toLowerCase().matches("(choko|chokolate|chok)+") || (sugarLevel / weight) <= 0.4) {
            sweetness = createChocolate(name, weight, sugarLevel);
        } else if (name.toLowerCase().matches("(bar)+") || ((sugarLevel / weight) > 0.4 && (sugarLevel / weight) < 0.6)) {
            sweetness = createBar(name, weight, sugarLevel);
        } else if (name.toLowerCase().matches("(candy|cand)+") || (sugarLevel / weight) >= 0.6) {
            sweetness = createCandy(name, weight, sugarLevel);
        }
        return sweetness;
    }
    private static Sweetness createChocolate(String name, double weight, double sugarLevel) {
        return new Chocolate(weight, sugarLevel, name);
    }
    private static Sweetness createCandy(String name, double weight, double sugarLevel) {
        return new Candy(weight, sugarLevel, name);
    }
    private static Sweetness createBar(String name, double weight, double sugarLevel) {
        return new Bar(weight, sugarLevel, name);
    }
}
