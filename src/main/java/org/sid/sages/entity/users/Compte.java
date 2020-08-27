package org.sid.sages.entity.users;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

public  class Compte   {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	
	@Column(name="nom")
	private String nom  ;
	@Column(name="pays")
	private String pays  ;
	 
	@Column(name="adresse")
	private String adresse  ;
	@Column(name="email")
	private String email  ;
	@Column(name="tel")
	private Long tel   ;

}
