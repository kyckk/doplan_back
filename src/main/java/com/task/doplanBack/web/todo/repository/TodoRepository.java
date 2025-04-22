package com.task.doplanBack.web.todo.repository;

import com.task.doplanBack.web.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    @Query("SELECT MAX(t.todoId) FROM Todo t")
    int findMaxTodoId();
    @Query("SELECT t FROM Todo t WHERE t.updatedAt BETWEEN :start AND :end AND t.completed = true")
    List<Todo> findByCreatedAtBetweenAndCompletedIsTrue(@Param("start") LocalDate start, @Param("end") LocalDate end);

}
