package hw.student;

import hw.WorkStrategy;

public class DefaultStudent implements Students{
    @Override
    public void work(WorkStrategy strategy) {
        strategy.toDo();
    }
}
