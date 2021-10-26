package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RapportPrimordiale")
public class RapportPrimordiale implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRapportPrimordiale;

	@Column(name = "commentaire")
	private String commentaire;

	@Column(name = "Eligible")
	private String Eligible;

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getEligible() {
		return Eligible;
	}

	public void setEligible(String eligible) {
		Eligible = eligible;
	}

	@Override
	public String toString() {
		return "RapportPrimordiale [commentaire=" + commentaire + ", Eligible=" + Eligible + "]";
	}
	
	@OneToOne(mappedBy="rapportPrimordiale")
	private Patient patient;
	

	@ManyToOne
	Chirugien chirugien;
	
}