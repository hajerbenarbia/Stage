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
@Table(name = "InformationPatient")
public class InformationPatient implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInformationPatient;
	
	

	@Column(name = "titreInfoPatient")
	private String titreInfoPatient;
	

	@Column(name = "descriptInfoPatient")
	private String descriptInfoPatient;


	public String getTitreInfoPatient() {
		return titreInfoPatient;
	}


	public void setTitreInfoPatient(String titreInfoPatient) {
		this.titreInfoPatient = titreInfoPatient;
	}


	public String getDescriptInfoPatient() {
		return descriptInfoPatient;
	}


	public void setDescriptInfoPatient(String descriptInfoPatient) {
		this.descriptInfoPatient = descriptInfoPatient;
	}


	@Override
	public String toString() {
		return "InformationPatient [titreInfoPatient=" + titreInfoPatient + ", descriptInfoPatient="
				+ descriptInfoPatient + "]";
	}
	
	@ManyToOne
	RendezVous rendezVous ;
}