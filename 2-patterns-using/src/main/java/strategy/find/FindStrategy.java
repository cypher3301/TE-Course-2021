package strategy.find;

import sweetess.Sweetness;

import java.util.List;

public interface FindStrategy {

    List<Sweetness> find(List<Sweetness> sweetnessList);
}
