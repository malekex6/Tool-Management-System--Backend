
package com.safrangroup.outil.controller;

import com.safrangroup.outil.DTO.ArticleDTO;
import com.safrangroup.outil.service.ArticleService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("articles")
public class ArticleController {
    
    
    private ArticleService  articleservice;
    
    public ArticleController(ArticleService articleservice){
        this.articleservice = articleservice;
    }
    
    @GetMapping()
    public List<ArticleDTO> getArticle(){
        return articleservice.findAll();
    }
    
    @PostMapping()
    public ArticleDTO save(@RequestBody() ArticleDTO articledto){
        
        return articleservice.save(articledto);
    }
    
}
