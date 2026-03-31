package com.dongyang.basicExample.controller;

import com.dongyang.basicExample.dto.ArticleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "article/new";
    }
    @PostMapping("/articles/create")
    public String newArticleForm(ArticleDTO dto) {
        //1. 파라미터 받기
        //2. DTO 만들어서 -> setter setting
        //1~2번은 spring에서 알아서 해줘가지고 할 필요 x
        System.out.println("title:"+dto.getTitle());
        System.out.println("contents:"+dto.getContents());

        //3. DAO 만들어서 2번 DTO 전달
        return "";
    }
}
