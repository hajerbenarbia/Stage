package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Patient;


public interface PatientService {

	 public 	List<Patient> retrieveAllPatient();

	public void  deletePatient(String id) ;
	public  Patient updatePatient(Patient patient);
		
	
	 public Patient retrievePatient(Long id);
	public  Patient retrievePatient(String id) ;
	
public 	Patient addPatient(Patient r) ;
		
}





	
