package hw.professor;

import hw.UniversityPerson;
import hw.WorkStrategy;

/**
 * Professor can give a lecture or practice
 */
public class Professor implements UniversityPerson {


    /**
     * Professor work
     */
    @Override
    public void work(WorkStrategy strategy) {
        strategy.toDo();
    }
}
