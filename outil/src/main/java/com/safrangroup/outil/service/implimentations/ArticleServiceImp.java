/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.safrangroup.outil.service.implimentations;

import com.safrangroup.outil.DTO.ArticleDTO;
import com.safrangroup.outil.model.Article;
import com.safrangroup.outil.service.ArticleService;
import com.safrangroup.outil.repository.ArticleRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImp implements ArticleService{
    
    
    private  ArticleRepository repository;

    
    public ArticleServiceImp(ArticleRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public ArticleDTO save(ArticleDTO articleDTO) {
        
       return ArticleDTO.toDto(repository.save(ArticleDTO.fromDto(articleDTO)));

    }

    @Override
    public ArticleDTO findbyId(Long id) {
        Optional<Article> article =(Optional<Article>)(Object) repository.findById(id);
        if (id==null){
            repository.findById(id).orElseThrow(()-> new RuntimeException("Article non trouvee"));
        }
      //  return repository.findById(id)
        return Optional.of(ArticleDTO.toDto(article.get())).orElseThrow(() -> new RuntimeException("Article non trouvée"));
    
    }

    @Override
    public ArticleDTO findbyNom(String Nom) {
               // List<Hotel> hotels = (List<Hotel>) (Object) repository.findAll();

        Optional<Article> article =(Optional<Article>)(Object) repository.findbyNom(Nom);

         return Optional.of(ArticleDTO.toDto(article.get())).orElseThrow(() -> new RuntimeException("Nom Article non trouvée"));

   
    }

    @Override
    public void delete(Long id) {
        
       repository.deleteById(id);   
    }

    @Override
    public ArticleDTO update(ArticleDTO articleDTO) {
            
        Optional<Article> currentHotel = (Optional<Article>) (Object) repository.findById(articleDTO.getId());
        Article  hotelEdit = currentHotel.orElse(null);
        if (hotelEdit == null) 
            return null;
         else 
            return save(articleDTO);
    
    }

    @Override
    public List<ArticleDTO> findAll() {
        
     List<Article> articles = (List<Article>) (Object) repository.findAll();
        if (articles.isEmpty()) {
            throw new  RuntimeException("Il n'ya aucun article dans la base ");
        } else {
            return articles.stream().map(ArticleDTO::toDto).collect(Collectors.toList());
        }
    
     } 
    
}
