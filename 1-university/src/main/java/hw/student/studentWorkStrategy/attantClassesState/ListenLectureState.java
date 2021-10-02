package hw.student.studentWorkStrategy.attantClassesState;

import hw.WorkState;

public class ListenLectureState implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Listened!!!");
    }
}
