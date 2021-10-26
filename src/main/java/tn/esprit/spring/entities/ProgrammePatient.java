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
@Table(name = "ProgrammePatient")
public class ProgrammePatient implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProgrammePatient;
	
	

	@Column(name = "periode")
	private String periode;



	@Override
	public String toString() {
		return "ProgrammePatient [periode=" + periode + "]";
	}



	public String getPeriode() {
		return periode;
	}



	public void setPeriode(String periode) {
		this.periode = periode;
	}
	
	@OneToOne(mappedBy="programmePatient")
	private  Patient patient;
	
	@ManyToOne
	private Chirugien chirugien;
}