package org.sid.sages.entity.users;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.sid.sages.entity.Disscussion;

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
	
	@Column(name="fullname")
	private String fullname  ;
	@Column(name="country")
	private String country  ;
	 
	@Column(name="password")
	private String password  ;
	@Column(name="email")
	private String email  ;
	@Column(name="phone")
	private Long phone   ;

	
	@OneToOne 
	private Disscussion disscussion ;
}
