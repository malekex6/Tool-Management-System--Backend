
package com.safrangroup.outil.DTO;


import com.safrangroup.outil.model.Article;
import com.safrangroup.outil.model.Famille;
import java.util.List;
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

public class FamilleDTO {
    
    private Long id;
  
  private String nom_famille;
   private List<Article> article;

    
    
    
    public static Famille fromDto(FamilleDTO familleDto) {
        Famille famille = new Famille();
        famille.setId(familleDto.getId());
        famille.setNom_famille(familleDto.getNom_famille());
        return famille;
    }

    public static FamilleDTO toDto(Famille famille) {
        FamilleDTO familleDto = new FamilleDTO();
        familleDto.setId(famille.getId());
        familleDto.setNom_famille(famille.getNom_famille());

        return familleDto;
    }
     
}
