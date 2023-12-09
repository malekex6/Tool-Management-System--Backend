package com.safrangroup.outil.model;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public enum Poste {

    aucun(0),poste_1(1),poste_2(2),poste_3(3),poste_4(4),poste_5(5);
    private final int code;

 

        Poste(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
      public static Poste getEnumByCode(int id) {
        for (Poste e : values()) {
            if (e.getCode() == id) {
                return e;
            }
        }
        return null;
    }
  
}
