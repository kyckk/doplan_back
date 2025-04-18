package com.task.doplanBack.web.todo.controller;


import com.task.doplanBack.web.todo.model.Todo;

import com.task.doplanBack.web.todo.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    private TodoRepository todoRepository;


    @GetMapping("/todoList")
    public List<Todo> todList(){

        log.info("index 진입");

        return  todoRepository.findAll();
    }
    @PostMapping("/saveTodo")
    @ResponseBody
    public String saveTodo(@RequestBody List<Todo> todo){
        log.info(String.valueOf(todo));
        int todoMax= todoRepository.findMaxTodoId();
        log.info("최댓값~~~~~~~~~~~"+String.valueOf(todoMax));
        AtomicInteger i = new AtomicInteger(1);
        todo= todo.stream().map(t->{

            if (t.getTodoId() == null) {
                t.setTodoId(todoMax+i.getAndIncrement()); // 예시: 임시 ID로 0L 부여
            }

            if (t.getCreatedAt() == null) {
                t.setCreatedAt(LocalDate.now()); // 예시: 임시 ID로 0L 부여
            }
            if (t.getUpdatedAt() == null) {
                t.setUpdatedAt(LocalDate.now()); // 예시: 임시 ID로 0L 부여
            }
            return t;
        }).collect(Collectors.toList());;
        //log.info(saveList.toString());
        todoRepository.saveAll(todo);
        return "";
    }

}

