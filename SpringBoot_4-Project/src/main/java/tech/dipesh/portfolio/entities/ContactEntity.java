package tech.dipesh.portfolio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ContactDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 30)
	private String name;
	
	@Column(length = 50, unique = true)
	private String email;
	
	@Column(length = 50)
	private String subject;
	
	@Column(length = 1000)
	private String message;
	
	
	private String datetime;
}
