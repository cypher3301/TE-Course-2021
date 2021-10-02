package hw.student.studentWorkStrategy;

import hw.WorkState;
import hw.WorkStrategy;

public class ToDoHomeWork implements WorkStrategy {
    private WorkState workState;

    @Override
    public void toDo() {
        workState.save("I am doing home work!");
        System.out.println("I am doing home work!");
    }
}
