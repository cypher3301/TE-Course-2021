package hw.laborant.laborantAssistantStrategy;

import hw.WorkState;
import hw.WorkStrategy;

public class InstallSoftware implements WorkStrategy {
    private WorkState workState;

    @Override
    public void toDo() {
        workState.save("I am installing software naw!");
        System.out.println("I am installing software naw!");
    }
}
