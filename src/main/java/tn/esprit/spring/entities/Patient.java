package tn.esprit.spring.entities;



import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "Patient")
public class Patient implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPatient;

	

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCivilité() {
		return civilité;
	}

	public void setCivilité(String civilité) {
		this.civilité = civilité;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTelFixe() {
		return numTelFixe;
	}

	public void setNumTelFixe(String numTelFixe) {
		this.numTelFixe = numTelFixe;
	}

	public String getNumTelPortable() {
		return numTelPortable;
	}

	public void setNumTelPortable(String numTelPortable) {
		this.numTelPortable = numTelPortable;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public String getPoids() {
		return poids;
	}

	public void setPoids(String poids) {
		this.poids = poids;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "fistName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Temporal(TemporalType.DATE)
	@Column(name = "birthDate")
	private Date birthDate;

	@Column(name = "civilité")
	private String civilité;

	@Column(name = "address")
	private String address;
	

	@Column(name = "email")
	private String email;
	

	@Column(name = "numTelFixe")
	private String numTelFixe;
	

	@Column(name = "numTelPortable")
	private String numTelPortable;

	@Column(name = "taille")
	private String taille;
	

	@Column(name = "poids")
	private String poids;

	@Column(name = "type")
	private String type;
	
	@OneToOne
	private RapportRCP rapportRCP;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="patient")
	private Set<RendezVous> rendezVous;
	
	@OneToOne
	private FichePatient fichePatient;
	
	@OneToOne
	private RapportPrimordiale rapportPrimordiale;
 
	@OneToMany(cascade = CascadeType.ALL, mappedBy="patient")
	private Set<Question> question;

	@OneToOne
	private ProgrammePatient programmePatient;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="patient")
	private Set<InterventionChirugicale> interventionChirugicale;

	public void setIdPatient(long id) {
		// TODO Auto-generated method stub
		
	}

	public long getIdPatient() {
		return idPatient;
	}

	
	
	}





