package com.back.domain.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Post {

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncrement
    private int id;

    @Column(length = 100, nullable = false) // varchar(100), NotNull
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;


    public Post(String title, String content){
        this.createDate = LocalDateTime.now();
        this.modifyDate = LocalDateTime.now();
        this.title = title;
        this.content = content;
    }
}
