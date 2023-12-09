
package com.safrangroup.outil.service;

import com.safrangroup.outil.DTO.ArticleDTO;
import java.util.List;
import org.springframework.stereotype.Service;


public interface ArticleService {

   ArticleDTO  save(ArticleDTO articleDTO); 
   
   ArticleDTO findbyId(Long id);
   
   ArticleDTO findbyNom (String nom);
   
   void delete (Long id);
   
   ArticleDTO update(ArticleDTO articleDTO); 
   
   List<ArticleDTO> findAll(); 

}
