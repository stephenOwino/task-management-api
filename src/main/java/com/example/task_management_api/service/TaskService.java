package com.example.task_management_api.service;

import com.example.task_management_api.model.Task;
import com.example.task_management_api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskService {

     /* TASK 3: CREATE THE SERVICE (TaskService.java)
		 * 1. Create a class and annotate it with @Service.
		 * 2. Inject your TaskRepository using a standard constructor.
		 * 3. Write the business logic method: public Task saveTask(Task task)
		 *    - Use this exact date check: task.getDueDate().isBefore(java.time.LocalDate.now())
            *    - If the check is true, throw new IllegalArgumentException("Due date cannot be in the past!");
		 *    - Otherwise, pass the task to the repository to save it and return the result.
            */

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public Task saveTask(Task task){
        if(task.getDueDate().isBefore(LocalDate.now())) {
                throw new IllegalArgumentException("Due date cannot be in the past!");

        }
        return taskRepository.saveTask(task);
    }
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
}
