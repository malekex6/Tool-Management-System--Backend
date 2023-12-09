package com.safrangroup.outil.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Article")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Article implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String caracteristique;
    @Column(nullable = false)
    private String nom;
            
    private String ref_metrologique;
    
    
    private int stock_min;
    
    private boolean GMAO;
    
    private double prix;
    
    private int qte;
    
    private boolean deuxD_troisD;
    
    private boolean image;
    
    @Column(name="aStocker" , nullable = false)
    private boolean aStocker;
    
    @ManyToOne
    private Famille famille;
    
    
    @ManyToOne
    private Marque marque;
    
    @Enumerated(EnumType.STRING)
    private Nature nature;
    
    @Enumerated(EnumType.STRING)
    private Poste poste;
    
    @Enumerated(EnumType.STRING)
    private Utilisation utilisation;
    
    @ManyToOne
    private Typologie typologie;
    
 
    @Enumerated(EnumType.STRING)
    private Categorie categorie;
    
    @ManyToMany
    @JoinTable(
            name = "fournisseur_article",joinColumns = @JoinColumn(name="code")
            , inverseJoinColumns = @JoinColumn(name = "ref_fournisseur")
              )
    private List<Fournisseur> fournisseur;
    
}
