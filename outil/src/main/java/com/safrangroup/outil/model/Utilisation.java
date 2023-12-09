package com.safrangroup.outil.model;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


public enum Utilisation {

    auPoste(1),Commun(2);
    private final int code;

        Utilisation(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
      public static Utilisation getEnumByCode(int id) {
        for (Utilisation e : values()) {
            if (e.getCode() == id) {
                return e;
            }
        }
        return null;
    }

}
