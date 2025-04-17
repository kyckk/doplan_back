package com.task.doplanBack.web.todo.repository;

import com.task.doplanBack.web.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    @Query("SELECT MAX(t.todoId) FROM Todo t")
    int findMaxTodoId();
}
