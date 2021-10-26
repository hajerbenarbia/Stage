package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PersonnelDeSante")
public class PersonnelDeSante implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersonnelDeSante;
	
	

	@Column(name = "fistName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;

	@Column(name = "civilite")
	private String civilite;
	
	@Column(name = "numTel")
	private String numTel;
	
	@Column(name = "adress")
	private String adress;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "discipline")
	private String discipline;

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

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PersonnelDeSante [firstName=" + firstName + ", lastName=" + lastName + ", civilite=" + civilite
				+ ", numTel=" + numTel + ", adress=" + adress + ", email=" + email + ", discipline=" + discipline + "]";
	}
	
	@ManyToOne
	private Equipepluridisciplinaire equipepluridiciplinaire;
	
}