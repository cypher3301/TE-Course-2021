package strategy.collect;

import sweetess.Sweetness;
import sweetess.SweetnessFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectByWeight implements CollectStrategy {
    private double weight;
    private String[] names = new String[]{"cand", "candy", "bar", "Bars", "choko", "chocolate"};

    public CollectByWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public List<Sweetness> toCollect(List<Sweetness> sweetnessList) {
        if (sweetnessList == null) throw new NullPointerException();
        return put(sweetnessList);
    }

    private List<Sweetness> put(List<Sweetness> sweetnessList) {
        double sumWeight = 0;
        Random random = new Random();
        while (sumWeight < weight) {
            Sweetness sweetness = SweetnessFactory.create(
                    names[random.nextInt(names.length)],
                    random.nextInt(100)+10,
                    random.nextDouble() % 0.4 + 0.2
            );
            sweetnessList.add(sweetness);
            sumWeight = sumWeight + sweetness.getWeight();
        }
        return sweetnessList;
    }

    @Override
    public List<Sweetness> toCollect() {
        List<Sweetness> sweetness = new ArrayList<>();
        return put(sweetness);
    }
}
