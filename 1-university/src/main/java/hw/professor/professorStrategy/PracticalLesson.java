package hw.professor.professorStrategy;

import hw.WorkState;

public class PracticalLesson extends LessonConductor{

    private WorkState workState;

    @Override
    public void toDo() {
        workState.save("I am giving a practical lesson now!");
        System.out.println("I am giving a practical lesson now!");
    }
}
