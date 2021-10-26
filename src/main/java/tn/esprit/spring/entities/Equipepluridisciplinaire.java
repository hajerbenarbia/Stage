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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "equipepluridisciplinaire")
public class Equipepluridisciplinaire implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipepluridisciplinaire;

	@Column(name = "Nom")
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Equipepluridisciplinaire [nom=" + nom + "]";
	}
	
	
	@ManyToMany(mappedBy="profesionneldesante", cascade = CascadeType.ALL)
	private Set< profesionneldesante>  profesionneldesante;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="equipepluridiciplinaire")
	private Set<PersonnelDeSante> personnelDeSante;
	
	@ManyToOne
	private EtablissementMedicale etablissementMedicale;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="equipepluridiciplinaire")
	private Set<InterventionChirugicale> interventionChirugicale;
	
}
