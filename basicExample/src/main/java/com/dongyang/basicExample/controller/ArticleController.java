package com.dongyang.basicExample.controller;

import com.dongyang.basicExample.dto.ArticleDTO;
import com.dongyang.basicExample.entity.ArticleEntity;
import com.dongyang.basicExample.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired //DI 작업이 정의되어 있음
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "article/new";
    }
    @PostMapping("/articles/create")
    public String newArticleForm(ArticleDTO dto) {
        //1. 파라미터 받기
        //2. DTO 만들어서 -> setter setting
        //1~2번은 spring에서 알아서 해줘가지고 할 필요 x
        //console창에 title,contents가 뜨는 지 확인
        //System.out.println("title:"+dto.getTitle());
        //System.out.println("contents:"+dto.getContents());

        //3. DAO 만들어서 2번 DTO 전달

        //1. dto 값을 ArticleEntity의 객체 생생해서 값을 넣어줌
        //ArticleEntity an = new ArticleEntity(null, dto.getTitle(),dto.getContents());
        ArticleEntity an = dto.toEntity();
        //2. ArticleRepository객체생성 후 save(1번결과) 호출
        articleRepository.save(an);
        return "";
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable("id") Long id){
        System.out.println("path value:" + id);
        return "article/show";
    }

}
