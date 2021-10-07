package sweetess;

import strategy.collect.CollectStrategy;
import strategy.find.FindStrategy;
import strategy.sort.SortStrategy;

import java.util.List;

public interface SweetsBag {
    List<Sweetness> toCollect(CollectStrategy collectStrategy);
    List<Sweetness> sort(SortStrategy strategy);
    List<Sweetness> find(FindStrategy strategy);
    List<Sweetness> add(Sweetness sweetness);


    List<Sweetness> getSweetness();
    void setSweetness(List<Sweetness> sweetness);
}
