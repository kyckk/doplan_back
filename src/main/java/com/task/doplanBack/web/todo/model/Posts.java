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
@Table(name="posts")// 테이블이름
public class Posts {
    @Id
    private int postId;
    private String title;
    private String content;
    private String author;
    private LocalDate createdAt;
}
