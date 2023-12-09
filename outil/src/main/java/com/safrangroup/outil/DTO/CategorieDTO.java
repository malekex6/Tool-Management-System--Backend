package com.safrangroup.outil.DTO;

import com.safrangroup.outil.model.Categorie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategorieDTO {
    private int code;

    public static CategorieDTO toDto(Categorie categorie) {
        return new CategorieDTO(categorie.getCode());
    }

    public static Categorie fromDto(CategorieDTO categorieDTO) {
        for (Categorie e : Categorie.values()) {
            if (e.getCode() == categorieDTO.getCode()) {
                return e;
            }
        }
        return null;
    }
}
