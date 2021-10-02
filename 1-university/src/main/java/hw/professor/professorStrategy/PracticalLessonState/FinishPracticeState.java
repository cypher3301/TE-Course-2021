package hw.professor.professorStrategy.PracticalLessonState;

import hw.WorkState;

public class FinishPracticeState implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Practice finished!!!");
    }
}
