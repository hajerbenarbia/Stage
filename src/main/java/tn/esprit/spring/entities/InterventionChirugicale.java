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
@Table(name = "InterventionChirugicale")
public class InterventionChirugicale implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInterventionChirugicale;
	
	

	@Column(name = "nomEtablissement")
	private String nomEtablissement;
	
	@Column(name = "nomDepartement")
	private String nomDepartement;
	
	@Column(name = "Adresse")
	private String Adresse;
	
	@Column(name = "numTelFixe")
	private String numTelFixe;
	
	@Column(name = "email")
	private String email;

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
	}

	public String getNomDepartement() {
		return nomDepartement;
	}

	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getNumTelFixe() {
		return numTelFixe;
	}

	public void setNumTelFixe(String numTelFixe) {
		this.numTelFixe = numTelFixe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "InterventionChirugicale [nomEtablissement=" + nomEtablissement + ", nomDepartement=" + nomDepartement
				+ ", Adresse=" + Adresse + ", numTelFixe=" + numTelFixe + ", email=" + email + "]";
	}
	
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private EtablissementMedicale etablissementMedicale;
	
	@ManyToOne
	private Equipepluridisciplinaire equipepluridiciplinaire;
	
	@ManyToOne
	private Chirugien chirugien;
	
	
}
	