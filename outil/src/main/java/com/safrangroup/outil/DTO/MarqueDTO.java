
package com.safrangroup.outil.DTO;

import com.safrangroup.outil.model.Fournisseur;
import com.safrangroup.outil.model.Marque;

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
public class MarqueDTO {
     private Long id;
     private String nom;
             
         public static Marque fromDto(MarqueDTO marquedto) {
        Marque c = new Marque();
        c.setId(marquedto.getId());
        c.setNom(marquedto.getNom());

        if (marquedto.getId() != null) {
                c.setId(marquedto.getId());
        }
        return c;
    }

    public static MarqueDTO toDto(Marque marque) {

        MarqueDTO marquedto = new MarqueDTO();
        marquedto.setId(marque.getId());
        marquedto.setNom(marque.getNom());
          
        return marquedto;
    }        
}
