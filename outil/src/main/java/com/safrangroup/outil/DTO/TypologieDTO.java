package com.safrangroup.outil.DTO;


import com.safrangroup.outil.model.Typologie;
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
public class TypologieDTO {
    private Long id;

    private String nom;
  
 
    public static Typologie fromDto(TypologieDTO typologiedto) {
        Typologie c = new Typologie();
        c.setId(typologiedto.getId());
        c.setNom(typologiedto.getNom());

        if (typologiedto.getId() != null) {
                c.setId(typologiedto.getId());
        }
        return c;
    }

    public static TypologieDTO toDto(Typologie typologie) {

        TypologieDTO typologiedto = new TypologieDTO();
        typologiedto.setId(typologie.getId());
        typologiedto.setNom(typologie.getNom());
          
        return typologiedto;
    }
   
}
