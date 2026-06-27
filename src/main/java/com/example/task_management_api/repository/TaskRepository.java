package com.example.task_management_api.repository;

import com.example.task_management_api.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class TaskRepository {

    /* TASK 2: CREATE THE REPOSITORY (TaskRepository.java)
		 * 1. Create a class and annotate it with @Repository.
		 * 2. Inside, declare a private final Map<String, Task> using ConcurrentHashMap.
		 * 3. Implement the standard in-memory CRUD methods:
            *    - public List<Task> findAll()
		 *    - public Optional<Task> findById(String id)
		 *    - public Task save(Task task) -> (Remember map.put(key, value) returns a receipt!)
            *    - public void deleteById(String id)*/

    private final Map<String , Task> tasks = new ConcurrentHashMap<>();

    public List<Task> findAll(){
        return new ArrayList<>(tasks.values());
    }
    public Optional<Task> findById(String id){
        return Optional.ofNullable(tasks.get(id));
    }

    public Task saveTask(Task task){
        Task savedTask = new Task(task.getId(), task.getTitle(),task.getDueDate(),task.getStatus());
        tasks.put(task.getId() , savedTask);
        return savedTask;
    }
    public void deleteTask(String id){
        tasks.remove(id);
    }
}
