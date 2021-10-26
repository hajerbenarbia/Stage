package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.RendezVous;



public interface RendezVousService {
	
 public 	List<RendezVous> retrieveAllRDVS();
	
public 	 RendezVous addRendezVous(RendezVous r) ;
		
	//// public void deleteRendezVous(Long idRendezVous);
	public void  deleteRendezVous(String id) ;
	public  RendezVous updateRendezVous(RendezVous rendezVous);
		
	
	 public RendezVous retrieveRendezVous(Long id);
	public  RendezVous retrieveRendezVous(String id) ;

}
