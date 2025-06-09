package by.logisticbp.listener;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

@Component
public class UserTaskCompletionListener implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("Task has been completed: " + delegateTask.getName());
    }
}
