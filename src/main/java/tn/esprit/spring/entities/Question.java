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
@Table(name = "Question")
public class Question implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idQuestion;
	
	

	@Column(name = "titre")
	private String titre;
	
	
	@Override
	public String toString() {
		return "Question [titre=" + titre + ", reponse=" + reponse + "]";
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getRéponse() {
		return reponse;
	}


	public void setRéponse(String réponse) {
		this.reponse = réponse;
	}


	@Column(name = "réponse")
	private String reponse;
	
	@ManyToOne
	Patient patient;
	
	@ManyToOne
	Chirugien chirugien;
	
}
