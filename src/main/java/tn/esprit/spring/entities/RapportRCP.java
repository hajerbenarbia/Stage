package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RapportRCP")
public class RapportRCP implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRapportRCP;
	
	

	@Column(name = "resultat")
	private String resultat;



	@Override
	public String toString() {
		return "RapportRCP [resultat=" + resultat + "]";
	}



	public String getResultat() {
		return resultat;
	}



	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	@OneToOne(mappedBy="rapportRCP")
	private Patient patient;
}