package org.sid.sages.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "category")

@Data @AllArgsConstructor @NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Category {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	@Column(name="nom")
	private String nom ;
	@Column(name="name")
	private String Name ;
	@Column(name="descriptionFR")
	private String descriptionFR ;
	@Column(name="descriptionEN")
	private String descriptionEN ;
	
	@Column(name="storageFR")
	private String storageFR ;
	@Column(name="storageEN")
	private String storageEN ;
	
	@Column(name="locationFr")
	private String locationFR ;
	@Column(name="locationEN")
	private String locationEN ;
	
	@Column(name="statusFR")
	private String statusFR ;
	@Column(name="statusEN")
	private String statusEN ;
	
	@Column(name="harvestperiodFR")
	private String harvestperiodFR ;
	@Column(name="harvestperiodEN")
	private String harvestperiodEN ;
	
	@ManyToOne
	private Marque marque ; 


}
