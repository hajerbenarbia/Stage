package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.FichePatient;


public interface  FichePatientService {
	
 public 	List<FichePatient> retrieveAllFichePatient();
	
public 	FichePatient addFichePatient(FichePatient r) ;
		
	//// public void deleteRendezVous(Long idRendezVous);
	public void  deleteFichePatient(String id) ;
	public  FichePatient updateFichePatient(FichePatient fichePatient);
		
	
	 public FichePatient retrieveFichePatient(Long id);
	public  FichePatient retrieveFichePatient(String id) ;

}