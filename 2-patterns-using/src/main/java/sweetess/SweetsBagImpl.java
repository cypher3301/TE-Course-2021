package sweetess;

import strategy.collect.CollectStrategy;
import strategy.find.FindStrategy;
import strategy.sort.SortStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class SweetsBagImpl implements SweetsBag {
    private List<Sweetness> sweetness;

    public SweetsBagImpl(List<Sweetness> sweetness) {
        this.sweetness = sweetness;
    }


    @Override
    public List<Sweetness> toCollect(CollectStrategy collectStrategy) {
        return collectStrategy.toCollect(sweetness);
    }

    @Override
    public List<Sweetness> sort(SortStrategy strategy) {
        return strategy.sort(sweetness);
    }

    @Override
    public List<Sweetness> find(FindStrategy strategy) {
        return strategy.find(sweetness);
    }

    @Override
    public List<Sweetness> add(Sweetness sweetness) {
        if (sweetness == null) throw new NullPointerException();
        this.sweetness.add(sweetness);
        return this.sweetness;
    }

    @Override
    public List<Sweetness> getSweetness() {
        return sweetness;
    }

    @Override
    public void setSweetness(List<Sweetness> sweetness) {
        this.sweetness = sweetness;
    }


    public double getSweetsBagWeight() {
        return sweetness.stream().map(Sweetness::getWeight).reduce(0.0, Double::sum);
    }


    public List<Sweetness> findSweetnessBySugarLevel(double diapasonStart,double diapasonEnd) {
        return sweetness.stream().filter(x->(x.getSugarLevel()>=diapasonEnd && x.getSugarLevel()<=diapasonEnd)).collect(Collectors.toList());
    }
}
