package hw.professor.professorStrategy;

import hw.WorkState;

public class LectureLesson extends LessonConductor {
    private WorkState workState;

    @Override
    public void toDo() {
        workState.save("I am giving a lecture now!");
        System.out.println("I am giving a lecture now!");
    }
}
