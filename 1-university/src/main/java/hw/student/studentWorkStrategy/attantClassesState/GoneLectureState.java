package hw.student.studentWorkStrategy.attantClassesState;

import hw.WorkState;

public class GoneLectureState implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Gone!!!");
    }
}
