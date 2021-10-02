package hw.laborant.laborantAssistantStrategy.installSoftwareState;

import hw.WorkState;

public class FindSoftwareInstallSoftwareSate implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Found software!!!");
    }
}
