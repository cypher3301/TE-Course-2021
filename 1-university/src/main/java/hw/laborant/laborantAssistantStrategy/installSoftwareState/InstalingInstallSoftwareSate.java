package hw.laborant.laborantAssistantStrategy.installSoftwareState;

import hw.WorkState;

public class InstalingInstallSoftwareSate implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Software was installed!!!");
    }
}
