package strategy.collect;

import sweetess.Sweetness;

import java.util.List;

public interface CollectStrategy {
    List<Sweetness> toCollect(List<Sweetness> sweetnessList);
    List<Sweetness> toCollect();

}
