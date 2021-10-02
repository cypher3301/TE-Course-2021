package hw.professor.professorStrategy;

import hw.WorkStrategy;

public abstract class LessonConductor implements WorkStrategy {

    /**
     * Template method
     * Professor give lecture or practical
     */
    @Override
    public abstract void toDo();
}
