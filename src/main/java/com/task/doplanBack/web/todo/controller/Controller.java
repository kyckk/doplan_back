package com.task.doplanBack.web.todo.controller;


import com.task.doplanBack.web.todo.model.Todo;

import com.task.doplanBack.web.todo.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    private TodoRepository todoRepository;


    @GetMapping("/todoList")
    public List<Todo> todList(){

        log.info("index 진입");
        List<Todo> x= todoRepository.findAll();
        log.info(x.toString());
        return  todoRepository.findAll();
    }
    @PostMapping("/saveTodo")
    @ResponseBody
    public String saveTodo(@RequestBody List<Todo> todo){
        log.info(String.valueOf(todo));
        todoRepository.saveAll(todo);
        return "";
    }

}

