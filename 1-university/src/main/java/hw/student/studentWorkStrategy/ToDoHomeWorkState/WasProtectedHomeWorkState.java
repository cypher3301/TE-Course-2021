package hw.student.studentWorkStrategy.ToDoHomeWorkState;

import hw.WorkState;

public class WasProtectedHomeWorkState implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Professor got 4 points!!!");
    }
}
