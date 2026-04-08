package com.dongyang.basicExample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ArticleEntity {
    @Id
    @GeneratedValue //기본적인 ai(AUTO INCREAMENT) 동작을 함
    private Long Id;

    public ArticleEntity(){
    }

    public ArticleEntity(Long id, String title, String contents) {
        this.Id = id;
        this.title = title;
        this.contents = contents;
    }

    @Column
    private String title;
    @Column
    private String contents;
}
