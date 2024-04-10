package com.example.spring_recap.controller;

import com.example.spring_recap.model.todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class ToDoController {
    //["{test1", "test2}"]
    //["[test1","test2]"]
    //{description: "sss", status: "OPEN"}


    todo Testtodo = new todo("hui","OPEN");
    List<todo> todoliste = new ArrayList<>();

    @GetMapping ("/todo")
    public List<todo> getTodos(){
        return todoliste;
    }

    @PostMapping("/todo")
    public todo add(@RequestBody todo newToDo){
        System.out.println(newToDo);
        todoliste.add(newToDo);
        return Testtodo;
    }

}
