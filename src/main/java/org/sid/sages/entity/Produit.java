package org.sid.sages.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produit")
@JsonSerialize
@Data @AllArgsConstructor @NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Produit {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	@Column(name="nom")
	private String nom ;
	@Column(name="description")
	private String description;
	@Column(name="img")
	private String avatar ;
	/*@ManyToOne
	private Marque marque ;*/

}
