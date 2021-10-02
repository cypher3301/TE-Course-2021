package hw.professor.professorStrategy.LictureLessonState;

import hw.WorkState;

public class FinishLectureState implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Lecture finished!!!");
    }
}
