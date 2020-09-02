package org.sid.sages.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	@Column(name="nameFR")
	private String nameFR ;
	@Column(name="nameEN")
	private String nameEN ;
	
	@Column(name="descriptionFR")
	private String descriptionFR;
	@Column(name="descriptionEN")
	private String descriptionEN;
	
	@Column(name="paletFR")
	private String paletFR;
	@Column(name="paletEN")
	private String paletEN;
	
	@Column(name="boxpalet")
	private int boxpalet;
	
	@Column(name="netweightpalet")
	private int netweightpalet;
	
	@Column(name="grosweightpalet")
	private int grosweightpalet;
	
	@Column(name="heightpalet")
	private int heightpalet;
	
	@Column(name="palet20")
	private int palet20;
	
	@Column(name="palet40")
	private int palet40;
	
	@Column(name="istop")
	private boolean istop ;
	
	@ManyToOne
	private Category category ;
	
	@OneToOne
	private Image image ;
	
	
	
	
	
	
	/*@ManyToOne
	private Marque marque ;*/

}
