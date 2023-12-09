
package com.safrangroup.outil.DTO;

import com.safrangroup.outil.model.Article;
import com.safrangroup.outil.model.Fournisseur;

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
public class FournisseurDTO {
    private Long id;
    
    private String nom;
    
    public static Fournisseur fromDto(FournisseurDTO fournisseurdto) {
        Fournisseur c = new Fournisseur();
        c.setId(fournisseurdto.getId());
        c.setNom(fournisseurdto.getNom());

        if (fournisseurdto.getId() != null) {
                c.setId(fournisseurdto.getId());
        }
        return c;
    }

    public static FournisseurDTO toDto(Fournisseur fournisseur) {

        FournisseurDTO fournisseurdto = new FournisseurDTO();
        fournisseurdto.setId(fournisseur.getId());
        fournisseurdto.setNom(fournisseur.getNom());
          
        return fournisseurdto;
    }
    
}
