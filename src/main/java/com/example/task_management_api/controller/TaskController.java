package com.example.task_management_api.controller;


import com.example.task_management_api.model.Task;
import com.example.task_management_api.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/tasks")
@RestController
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    //get all
    @GetMapping
    public List<Task>getAllTasks(){
      return taskService.getAllTasks();

    }
    //save
    @PostMapping
    public Task saveTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }
    @DeleteMapping
    public void deleteTask(String id){

    }
}
