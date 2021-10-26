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

@Entity
@Table(name = "EtablissementMedicale")
public class EtablissementMedicale implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEtablissementMedicale;
	
	

	@Column(name = "nomEtablissementConsultation")
	private String nomEtablissementConsultation;
	
	@Override
	public String toString() {
		return "EtablissementMedicale [nomEtablissementConsultation=" + nomEtablissementConsultation
				+ ", nomDepartement=" + nomDepartement + ", lieuConsultation=" + lieuConsultation + ", numTelFixe="
				+ numTelFixe + ", numTelPortable=" + numTelPortable + ", email=" + email + "]";
	}

	@Column(name = "nomDepartement")
	private String nomDepartement;

	@Column(name = "lieuConsultation")
	private String lieuConsultation;
	
	@Column(name = "numTelFixe")
	private String numTelFixe;

	@Column(name = "numTelPortable")
	private String numTelPortable;
	
	@Column(name = "email")
	private String email;

	public String getNomEtablissementConsultation() {
		return nomEtablissementConsultation;
	}

	public void setNomEtablissementConsultation(String nomEtablissementConsultation) {
		this.nomEtablissementConsultation = nomEtablissementConsultation;
	}

	public String getNomDepartement() {
		return nomDepartement;
	}

	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}

	public String getLieuConsultation() {
		return lieuConsultation;
	}

	public void setLieuConsultation(String lieuConsultation) {
		this.lieuConsultation = lieuConsultation;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="etablissementMedicale")
	private Set<Equipepluridisciplinaire> equipepluridisciplinaires;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="etablissementMedicale")
	private Set<InterventionChirugicale> interventionChirugicales;

	
	}