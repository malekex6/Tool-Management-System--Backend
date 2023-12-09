package com.safrangroup.outil.model;




public enum Categorie {

    equipement(1),handtool(2);
    private final int code;

 

        Categorie(int code) {
        this.code = code;
    }

 

    public int getCode() {
        return code;
    }
      public static Categorie getEnumByCode(int id) {
        for (Categorie e : values()) {
            if (e.getCode() == id) {
                return e;
            }
        }
        return null;
    }
      

  
}
