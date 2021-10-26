package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name = "RendezVous")
public class RendezVous implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRendezVous;
	
	

	public Long getIdRendezVous() {
		return idRendezVous;
	}

	public void setIdRendezVous(Long idRendezVous) {
		this.idRendezVous = idRendezVous;
	}

	public String getLieuRDV() {
		return lieuRDV;
	}

	public void setLieuRDV(String lieuRDV) {
		this.lieuRDV = lieuRDV;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getRDVeffectue() {
		return RDVeffectue;
	}

	public void setRDVeffectue(String rDVeffectue) {
		RDVeffectue = rDVeffectue;
	}

	public Date getDateRDV() {
		return dateRDV;
	}

	public void setDateRDV(Date dateRDV) {
		this.dateRDV = dateRDV;
	}

	@Column(name = "lieuRDV")
	private String lieuRDV;
    

	@Column(name = "nomPatient")
	private String nomPatient;
	
	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	@Column(name = "commentaire")
	private String commentaire;

	@Column(name = "RDVeffectue")
	private String RDVeffectue;

	@Temporal(TemporalType.DATE)
	@Column(name = "dateRDV")
	private Date dateRDV;
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private FichePatient fichePatient;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="rendezVous")
	private Set<InformationPatient> informationPatients;
	
	@ManyToOne
	profesionneldesante profesionneldesante;
	
	@ManyToOne
	private Chirugien chirugien;



	public static Object findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<RendezVous> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static RendezVous save(RendezVous r) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}