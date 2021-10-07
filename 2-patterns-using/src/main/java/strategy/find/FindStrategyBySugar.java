package strategy.find;

import sweetess.Sweet;
import sweetess.Sweetness;

import java.util.List;
import java.util.stream.Collectors;

public class FindStrategyBySugar implements FindStrategy {

    private double startSugarLevel;
    private double endSugarLevel;

    public FindStrategyBySugar(double startSugarLevel, double endSugarLevel) {
        this.startSugarLevel = startSugarLevel;
        this.endSugarLevel = endSugarLevel;
    }

    @Override
    public List<Sweetness> find(List<Sweetness> sweetnessList) {
        return sweetnessList.stream().filter(x -> (x.getSugarLevel() >= startSugarLevel && x.getSugarLevel() <= endSugarLevel)).collect(Collectors.toList());
    }
}
