package com.task.doplanBack.web.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Data
@Table(name="todo")// 테이블이름
public class Todo {
    @Id
    private Integer todoId;
    private String content;
    private boolean completed;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
