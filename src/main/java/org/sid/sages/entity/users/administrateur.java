package org.sid.sages.entity.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "admin")
@JsonSerialize
@Data @AllArgsConstructor @NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class administrateur {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	@Column(name="email")
	private String email ;
	@Column(name="mdp")
	private String mdp ;

}
