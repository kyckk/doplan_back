package com.task.doplanBack.web.todo.repository;

import com.task.doplanBack.web.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
