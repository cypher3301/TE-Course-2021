package hw.laborant.laborantAssistantStrategy.repairComputerState;

import hw.WorkState;

public class LookingForProblemSoftwareSate implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Problem found!!!");
    }
}
