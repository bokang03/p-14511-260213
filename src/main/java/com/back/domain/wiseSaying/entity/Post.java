package com.back.domain.wiseSaying.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Post {

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncrement
    private int id;

    @Column(length = 100, nullable = false) // varchar(100), NotNull
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    public Post(String title, String content){
        this.title = title;
        this.content = content;
    }
}
