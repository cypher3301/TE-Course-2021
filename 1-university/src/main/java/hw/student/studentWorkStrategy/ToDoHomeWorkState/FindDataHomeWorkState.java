package hw.student.studentWorkStrategy.ToDoHomeWorkState;

import hw.WorkState;

public class FindDataHomeWorkState implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Found data!!!");
    }
}
