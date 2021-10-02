package hw.professor.professorStrategy.PracticalLessonState;

import hw.WorkState;

public class StartPracticeState implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Practice started!!!");
    }
}
