package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FichePatient")
public class FichePatient implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFichePatient;
	
	@OneToOne(mappedBy="fichePatient")
	private Patient patient;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="fichePatient")
	private Set<RendezVous> rendezVous;
	
	@ManyToOne
	private Chirugien chirugien;

	public void setIdFichePatient(long id) {
		// TODO Auto-generated method stub
		
	}
	
}