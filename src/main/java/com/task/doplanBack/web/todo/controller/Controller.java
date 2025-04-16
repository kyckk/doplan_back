package com.task.doplanBack.web.todo.controller;

import com.task.doplanBack.web.todo.model.Posts;
import com.task.doplanBack.web.todo.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    private PostRepository postRepository;


    @GetMapping("/todoList")
    public List<Posts> todList(){

        log.info("index 진입");
        return  postRepository.findAll();
    }


}

