package com.safrangroup.outil.DTO;

import com.safrangroup.outil.model.Nature;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NatureDTO {
    private int code;

    public static NatureDTO toDto(Nature nature) {
        return new NatureDTO(nature.getCode());
    }

    public static Nature FromDto(NatureDTO natureDTO) {
        for (Nature e : Nature.values()) {
            if (e.getCode() == natureDTO.getCode()) {
                return e;
            }
        }
        return null;
    }
}
