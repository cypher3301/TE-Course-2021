package hw.student.studentWorkStrategy;

import hw.WorkState;
import hw.WorkStrategy;

public class AttendClasses implements WorkStrategy {
    private WorkState workState;


    @Override
    public void toDo() {
        workState.save("I am on lecture naw!");
        System.out.println("I am on lecture naw!");
    }
}
