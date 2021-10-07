package strategy.sort;

import sweetess.Sweetness;

import java.util.List;
import java.util.stream.Collectors;

public class WeightSortStrategy implements SortStrategy {

    @Override
    public List<Sweetness> sort(List<Sweetness> sweetness) {
        return sweetness.stream().sorted((o1, o2) -> Double.compare(o2.getWeight(), o1.getWeight())).collect(Collectors.toList());
    }
}
