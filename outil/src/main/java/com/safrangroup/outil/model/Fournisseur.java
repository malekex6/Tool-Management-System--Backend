package com.safrangroup.outil.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "Fournisseur")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nom;
    
    @ManyToMany
    @JoinTable(
            name = "fournisseur_article",joinColumns = @JoinColumn(name="ref_fournisseur")
            , inverseJoinColumns = @JoinColumn(name = "code")
              )
    private List<Article> article;

    
}