
package com.safrangroup.outil.repository;

import com.safrangroup.outil.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface ArticleRepository extends JpaRepository<Article, Long>{
    Article findbyNom(String nom);
    
}
