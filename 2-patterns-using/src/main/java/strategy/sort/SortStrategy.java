package strategy.sort;

import sweetess.Sweetness;

import java.util.List;

public interface SortStrategy {
    List<Sweetness> sort(List<Sweetness> sweetnessList);
}
