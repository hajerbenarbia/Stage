package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profesionneldesante")
public class profesionneldesante implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idprofetionneldesante;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "civilité")
	private String civilité;

	@Column(name = "numeroRPS")
	private String numeroRPS;
	
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "numTelFixe")
	private String numTelFixe;
	
	@Column(name = "numTelPortable")
	private String numTelPortable;
	
	@Column(name = "nomEtablissementPrincipale")
	private String nomEtablissementPrincipale;
	
	@Column(name = "adressEtablissementPrincipale")
	private String 	adressEtablissementPrincipale;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCivilité() {
		return civilité;
	}

	public void setCivilité(String civilité) {
		this.civilité = civilité;
	}

	public String getNumeroRPS() {
		return numeroRPS;
	}

	public void setNumeroRPS(String numeroRPS) {
		this.numeroRPS = numeroRPS;
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

	public String getNomEtablissementPrincipale() {
		return nomEtablissementPrincipale;
	}

	public void setNomEtablissementPrincipale(String nomEtablissementPrincipale) {
		this.nomEtablissementPrincipale = nomEtablissementPrincipale;
	}

	public String getAdressEtablissementPrincipale() {
		return adressEtablissementPrincipale;
	}

	public void setAdressEtablissementPrincipale(String adressEtablissementPrincipale) {
		this.adressEtablissementPrincipale = adressEtablissementPrincipale;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "profesionneldesante [firstName=" + firstName + ", civilité=" + civilité + ", numeroRPS=" + numeroRPS
				+ ", email=" + email + ", numTelFixe=" + numTelFixe + ", numTelPortable=" + numTelPortable
				+ ", nomEtablissementPrincipale=" + nomEtablissementPrincipale + ", adressEtablissementPrincipale="
				+ adressEtablissementPrincipale + "]";
	}
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="profesionneldesante")
	private Set<RendezVous> rendezVous;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Equipepluridisciplinaire> profesionneldesante ;
	
}
