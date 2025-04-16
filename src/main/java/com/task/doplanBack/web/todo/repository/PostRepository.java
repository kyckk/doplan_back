package com.task.doplanBack.web.todo.repository;

import com.task.doplanBack.web.todo.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts,String> {
}
