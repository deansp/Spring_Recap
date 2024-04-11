package com.example.spring_recap.service;

import com.example.spring_recap.model.Status;
import com.example.spring_recap.model.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final List<ToDo>todoList = new ArrayList<>();
    public List<ToDo> getAllToDos(){
        return todoList;
    }

    public ToDo addTodo(ToDo todo){
        ToDo newToDo = new ToDo(
                UUID.randomUUID().toString(),
                todo.getDescription(),
                todo.getStatus());

        todoList.add(newToDo);
        return newToDo;
    }

    public ToDo editTodo(ToDo requiredTodo) {
        todoList.forEach(ToDo -> {
            System.out.println(requiredTodo);
            for(ToDo todos : todoList){
                if (Objects.equals(requiredTodo.getId(), todos.getId())) {
                    todos.setStatus(requiredTodo.getStatus());
                    System.out.println(todos.getStatus());
                }
            }
        });
        return requiredTodo;
    }
}
