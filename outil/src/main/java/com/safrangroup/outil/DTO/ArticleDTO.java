
package com.safrangroup.outil.DTO;

import com.safrangroup.outil.model.Article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter

public class ArticleDTO {
    private Long id;
   
    private String caracteristique;
    
    private String ref_metrologique;
    
    
    private int stock_min;
    
    private boolean GMAO;
    
    private double prix;
    
    private int qte;
    
    private boolean deuxD_troisD;
    
    private boolean image;
    
    private boolean aStocker;
    
    
     public static Article fromDto(ArticleDTO articledto) {
        Article c = new Article();
        c.setCaracteristique(articledto.getCaracteristique());
        c.setPrix(articledto.getPrix());
        c.setRef_metrologique(articledto.getRef_metrologique());
        c.setStock_min(articledto.getStock_min());
        c.setAStocker(articledto.isAStocker());
        c.setGMAO(articledto.isGMAO());
        c.setQte(articledto.getQte());
        c.setDeuxD_troisD(articledto.isDeuxD_troisD());
        c.setImage(articledto.isImage());  
        if (articledto.getId() != null) {
                c.setId(articledto.getId());
        }
        return c;
    }

    public static ArticleDTO toDto(Article article) {

        ArticleDTO articleDto = new ArticleDTO();
        articleDto.setId(article.getId());
        articleDto.setCaracteristique(article.getCaracteristique());
        articleDto.setRef_metrologique(article.getRef_metrologique());
        articleDto.setAStocker(article.isAStocker());
        articleDto.setStock_min(article.getStock_min());
        articleDto.setGMAO(article.isGMAO());
        articleDto.setPrix(article.getPrix());
        articleDto.setQte(article.getQte());
        articleDto.setDeuxD_troisD(article.isDeuxD_troisD());
        articleDto.setImage(article.isImage());    
        return articleDto;
    }
    
    
    
}
