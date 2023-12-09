package com.safrangroup.outil.model;



import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Famille")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Famille implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO) 
  private Long id;
  
  private String nom_famille;
  
  @OneToMany(mappedBy = "famille",cascade =CascadeType.ALL,fetch=FetchType.LAZY)
  private List<Article> article;
  
    public List<Article> getArticle() {
        return article;
    }
}
