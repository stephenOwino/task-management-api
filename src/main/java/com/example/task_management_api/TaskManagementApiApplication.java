package com.example.task_management_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagementApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(TaskManagementApiApplication.class, args);


		/*
		 * CHALLENGE 3: THE TASK MANAGEMENT SYSTEM (TODO API) 📋
		 *
		 * Scenario:
		 * You are building a backend for a productivity app. Each task has an ID,
		 * a title, a due date, and a completion status.
		 *
		 * The Live-Coding Business Rule:
		 * No task can be created if its due date is in the past. If a user tries
		 * to create a task with a past date, your service layer must throw an
		 * IllegalArgumentException with the message: "Due date cannot be in the past!".
		 *
		 * =========================================================================
		 *
		 * TASK 1: CREATE THE MODEL (Task.java)
		 * 1. Create a standard Java class annotated with Lombok (@Getter, @Setter, @AllArgsConstructor).
		 * 2. Define four private fields:
		 *    - String id
		 *    - String title
		 *    - java.time.LocalDate dueDate (The standard modern Java date type)
		 *    - String status (e.g., "PENDING", "COMPLETED")
		 *
		 * =========================================================================
		 *
		 * TASK 2: CREATE THE REPOSITORY (TaskRepository.java)
		 * 1. Create a class and annotate it with @Repository.
		 * 2. Inside, declare a private final Map<String, Task> using ConcurrentHashMap.
		 * 3. Implement the standard in-memory CRUD methods:
		 *    - public List<Task> findAll()
		 *    - public Optional<Task> findById(String id)
		 *    - public Task save(Task task) -> (Remember map.put(key, value) returns a receipt!)
		 *    - public void deleteById(String id)
		 *
		 * =========================================================================
		 *
		 * TASK 3: CREATE THE SERVICE (TaskService.java)
		 * 1. Create a class and annotate it with @Service.
		 * 2. Inject your TaskRepository using a standard constructor.
		 * 3. Write the business logic method: public Task saveTask(Task task)
		 *    - Use this exact date check: task.getDueDate().isBefore(java.time.LocalDate.now())
		 *    - If the check is true, throw new IllegalArgumentException("Due date cannot be in the past!");
		 *    - Otherwise, pass the task to the repository to save it and return the result.
		 *
		 * =========================================================================
		 *
		 * TASK 4: CREATE THE CONTROLLER (TaskController.java)
		 * 1. Create a class and annotate it with @RestController and @RequestMapping("/api/tasks").
		 * 2. Inject your TaskService using a constructor.
		 * 3. Expose two web endpoints:
		 *    - @GetMapping -> public List<Task> getAllTasks()
		 *    - @PostMapping -> public Task createTask(@RequestBody Task task)
		 *
		 * =========================================================================
		 *
		 * BONUS IN-LINE TIP FOR YOUR LIVE STREAMS:
		 * Explain your choices out loud as you type! Tell your viewers:
		 * "I am using LocalDate here because it is immutable and thread-safe compared to the old Date library."
		 */

	}

}
