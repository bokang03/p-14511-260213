package com.back.domain.wiseSaying.entity;

import jakarta.persistence.*;

@Entity
public class WiseSaying {

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncrement
    private int id;

    @Column(length = 100, nullable = false) // varchar(100), NotNull
    private String content;

    @Column(length = 50, nullable = false)
    private String author;
}
