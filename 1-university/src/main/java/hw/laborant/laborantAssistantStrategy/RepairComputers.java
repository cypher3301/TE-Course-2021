package hw.laborant.laborantAssistantStrategy;

import hw.WorkState;
import hw.WorkStrategy;

public class RepairComputers implements WorkStrategy {
    private WorkState workState;

    @Override
    public void toDo() {
        workState.save("I am repairing the computer naw!");
        System.out.println("I am repairing the computer naw!");
    }
}
