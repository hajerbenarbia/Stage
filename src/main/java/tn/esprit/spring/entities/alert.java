package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alert")
public class alert implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idalert;
	
	@Column(name = "desciplineAlert")
	private String desciplineAlert;

	public String getDesciplineAlert() {
		return desciplineAlert;
	}

	public void setDesciplineAlert(String desciplineAlert) {
		this.desciplineAlert = desciplineAlert;
	}

	@Override
	public String toString() {
		return "alert [idalert=" + idalert + ", desciplineAlert=" + desciplineAlert + "]";
	}
	
}
	