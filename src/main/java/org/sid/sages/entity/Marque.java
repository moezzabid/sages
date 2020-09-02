package org.sid.sages.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "marque")

@Data @AllArgsConstructor @NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Marque {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	@Column(name="nameFR")
	private String nameFR ;
	@Column(name="nameEN")
	private String nameEN ;
	
	@Column(name="descriptionFR")
	private String descriptionFR;
	@Column(name="descriptionEN")
	private String descriptionEN;
	
	
	@ManyToOne
	private Category category;
	
	@OneToOne
	private Image image ;
}
