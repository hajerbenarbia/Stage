package tn.esprit.spring.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Chirugien")
public class Chirugien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idChirugien;
	

	@Column(name = "fistName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	
	@Column(name = "addressDomicile")
	private String addressDomicile ;

	@Column(name = "civilité")
	private String civilité;

	@Column(name = "dicipline")
	private String dicipline;
	

	@Column(name = "email")
	private String email;
	

	@Column(name = "numTelDomicile")
	private String numTelDomicile;
	

	@Column(name = "numTelPerso")
	private String numTelPerso;

	@Column(name = "NumRPS")
	private String NumRPS;
	

	@Column(name = "lieuConsultation")
	private String lieuConsultation;

	@Column(name = "lieuInterventionChirugicale")
	private String lieuInterventionChirugicale;

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

	public String getAddressDomicile() {
		return addressDomicile;
	}

	public void setAddressDomicile(String addressDomicile) {
		this.addressDomicile = addressDomicile;
	}

	public String getCivilité() {
		return civilité;
	}

	public void setCivilité(String civilité) {
		this.civilité = civilité;
	}

	public String getDicipline() {
		return dicipline;
	}

	public void setDicipline(String dicipline) {
		this.dicipline = dicipline;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTelDomicile() {
		return numTelDomicile;
	}

	public void setNumTelDomicile(String numTelDomicile) {
		this.numTelDomicile = numTelDomicile;
	}

	public String getNumTelPerso() {
		return numTelPerso;
	}

	public void setNumTelPerso(String numTelPerso) {
		this.numTelPerso = numTelPerso;
	}

	public String getNumRPS() {
		return NumRPS;
	}

	public void setNumRPS(String numRPS) {
		NumRPS = numRPS;
	}

	public String getLieuConsultation() {
		return lieuConsultation;
	}

	public void setLieuConsultation(String lieuConsultation) {
		this.lieuConsultation = lieuConsultation;
	}

	public String getLieuInterventionChirugicale() {
		return lieuInterventionChirugicale;
	}

	public void setLieuInterventionChirugicale(String lieuInterventionChirugicale) {
		this.lieuInterventionChirugicale = lieuInterventionChirugicale;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Chirugien [firstName=" + firstName + ", lastName=" + lastName + ", addressDomicile=" + addressDomicile
				+ ", civilité=" + civilité + ", dicipline=" + dicipline + ", email=" + email + ", numTelDomicile="
				+ numTelDomicile + ", numTelPerso=" + numTelPerso + ", NumRPS=" + NumRPS + ", lieuConsultation="
				+ lieuConsultation + ", lieuInterventionChirugicale=" + lieuInterventionChirugicale + "]";
	}

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="chirugien")
	private Set<RendezVous> rendezVous;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="chirugien")
	private Set<FichePatient> fichePatients;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="chirugien")
	private Set<RapportPrimordiale> rapportPrimordiales ;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="chirugien")
	private Set<Question> questions ;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="chirugien")
	private Set<ProgrammePatient> programmePatients ;
	
	@ManyToOne
	private Administrateur administarteur;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="chirugien")
	private Set<InterventionChirugicale> interventionChirugicales;

	public void setIdChirugien(long id) {
		// TODO Auto-generated method stub
		
	}
	
}