package com.example.task_management_api.model;


import com.example.task_management_api.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Task {

    private String id;
    private String title;
    private LocalDate dueDate;
    private Status status;
}
