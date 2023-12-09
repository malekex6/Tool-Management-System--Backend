package com.safrangroup.outil.DTO;

import com.safrangroup.outil.model.Utilisation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UtilisationDTO {
    private int code;

    public static UtilisationDTO toDTO(Utilisation utilisation) {
        return new UtilisationDTO(utilisation.getCode());
    }

    public static Utilisation fromDto(UtilisationDTO utilisationDTO) {
        for (Utilisation e : Utilisation.values()) {
            if (e.getCode() == utilisationDTO.getCode()) {
                return e;
            }
        }
        return null;
    }
}
