package com.safrangroup.outil.DTO;

import com.safrangroup.outil.model.Poste;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PosteDTO {
    private int code;

    public static PosteDTO toDto(Poste poste) {
        return new PosteDTO(poste.getCode());
    }

    public static Poste fromDto(PosteDTO posteDTO) {
        for (Poste e : Poste.values()) {
            if (e.getCode() == posteDTO.getCode()) {
                return e;
            }
        }
        return null;
    }
}
