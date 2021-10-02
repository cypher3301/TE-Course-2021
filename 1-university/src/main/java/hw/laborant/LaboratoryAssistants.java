package hw.laborant;

import hw.UniversityPerson;
import hw.WorkStrategy;


/**
 * Laboratory Assistants can do repair computers or installing software
 */
public class LaboratoryAssistants implements UniversityPerson {


    /**
     * Laboratory Assistants work have a strategy and each strategy have state
     */
    @Override
    public void work(WorkStrategy strategy) {
        strategy.toDo();
    }
}
