package com.safrangroup.outil.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Marque")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Marque implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  

  private String nom;
  
  @OneToMany(mappedBy = "marque",cascade =CascadeType.ALL,fetch=FetchType.LAZY)
  private List<Article> article;
}
