package org.sid.sages.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "message")

@Data @AllArgsConstructor @NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Message {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	@Column(name="date")
	private Date date;
	@Column(name="message")
	private String message ;
	private Boolean vue ;
	@Column(name="personne")
	private String personne ;
	@ManyToOne
	private Disscussion disscussion ;
	
	

}
