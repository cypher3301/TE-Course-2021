package hw.student.studentWorkStrategy.ToDoHomeWorkState;

import hw.WorkState;

public class SendToProfessorHomeWorkState implements WorkState {
    @Override
    public void save(Object o) {
        System.out.println(o.toString()+"| Sent the homework!!!");
    }
}
