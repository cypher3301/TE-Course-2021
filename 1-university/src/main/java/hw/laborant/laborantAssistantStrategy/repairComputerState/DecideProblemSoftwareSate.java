package hw.laborant.laborantAssistantStrategy.repairComputerState;

import hw.WorkState;

public class DecideProblemSoftwareSate implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Problem decided!!!");
    }
}
