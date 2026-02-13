package com.back.domain.wiseSaying.entity;

import jakarta.persistence.*;

@Entity
public class Post {

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncrement
    private int id;

    @Column(length = 100, nullable = false) // varchar(100), NotNull
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
}
