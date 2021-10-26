package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name = "Admin")
public class Administrateur implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAdmin;
	
	

	@Column(name = "fistName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;
	/*

	@Override
	public String toString() {
		return "Administrateur [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", motdepasse=" + motdepasse + "]";
	}*/

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	@Column(name = "email")
	private String email;

	@Column(name = "motdepasse")
	private String motdepasse;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="administarteur")
	private Set<Chirugien> chirugiens;

	public void setAdministrateurCode(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
