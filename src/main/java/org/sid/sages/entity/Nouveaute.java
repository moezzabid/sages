package org.sid.sages.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "nouveaute")

@Data @AllArgsConstructor @NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Nouveaute {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	@Column(name="nom")
	private String nom ;
	@Column(name="description")
	private String description ;
	@Column(name="date")
	private Date date;
	@Column(name="img")
	private String img ;
	

	

}
