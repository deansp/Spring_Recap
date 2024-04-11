package com.example.spring_recap.controller;

import com.example.spring_recap.model.ToDo;
import com.example.spring_recap.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoService service;

    @GetMapping()
    public List<ToDo> getAllToDos() {
        return service.getAllToDos();
    }

    @PostMapping()
    public ToDo addTodo(@RequestBody ToDo newToDo) {
        return service.addTodo(newToDo);
    }
    @PutMapping("/{id}")
    public ToDo change(@RequestBody ToDo requiredTodo) {
        return service.editTodo(requiredTodo);
    }


}
