package com.example.taskmanager;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class TaskController {

    List<String> tasks = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "Task Manager App is Running 🚀";
    }

    @PostMapping("/addTask")
    public String addTask(@RequestParam String task) {
        tasks.add(task);
        return "Task Added: " + task;
    }

    @GetMapping("/tasks")
    public List<String> getTasks() {
        return tasks;
    }
}