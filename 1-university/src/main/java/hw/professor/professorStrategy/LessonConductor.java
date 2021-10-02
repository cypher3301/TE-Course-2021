package hw.professor.professorStrategy;

import hw.WorkStrategy;

/**
 * Abstract class LessonConductor of professor
 * witch can to give lecture or practical lessen
 */
public abstract class LessonConductor implements WorkStrategy {

    /**
     * Template method
     * Professor give lecture or practical
     */
    @Override
    public abstract void toDo();
}
