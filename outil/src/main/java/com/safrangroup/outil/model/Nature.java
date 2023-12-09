package com.safrangroup.outil.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



public enum Nature {

    achete(1),fabrique(2),fabrique_achete(3);

    private final int code;

 

        Nature(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
      public static Nature getEnumByCode(int id) {
        for (Nature e : values()) {
            if (e.getCode() == id) {
                return e;
            }
        }
        return null;
    }
   
}
