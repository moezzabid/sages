package org.sid.sages.entity;

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
@Table(name = "formulaire")

@Data @AllArgsConstructor @NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Formulaire {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	@Column(name="nom")
	private String nomPrenom ;
	@Column(name="email")
	private String email;
	@Column(name="mdp")
	private String mdp;
	@Column(name="tel")
	private int tel ;
	@Column(name="pays")
	private String pays ;


	

	
	

}
