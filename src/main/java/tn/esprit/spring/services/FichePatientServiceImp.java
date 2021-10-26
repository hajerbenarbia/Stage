package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.FichePatient;

import tn.esprit.spring.repositories.FichePatientRepo;


@Service
public class FichePatientServiceImp  implements FichePatientService{

	
	 
		@Autowired 
		FichePatientRepo fichePatientRepo; 
		@Override
			public List< FichePatient> retrieveAllFichePatient() {
				// TODO Auto-generated method stub
				return (List< FichePatient>) fichePatientRepo.findAll();
			}
		@Override
			public  FichePatient addFichePatient( FichePatient r) {
				// TODO Auto-generated method stub
				return fichePatientRepo.save(r);
			}

//			public void deleteRendezVous(Long idRendezVous) {
//				// TODO Auto-generated method stub
//				rendezVousRepo.deleteById(idRendezVous);
//			}
		
		
			@Override 
			public void deleteFichePatient(String idFichePatient) {
				// TODO Auto-generated method stub
				fichePatientRepo.deleteById(Long.parseLong(idFichePatient));
			}
			@Override
			public FichePatient updateFichePatient( FichePatient r) {
				// TODO Auto-generated method stub
				return fichePatientRepo.save(r);
						
						
			}

			@Override
			public  FichePatient retrieveFichePatient(Long id) {
				// TODO Auto-generated method stub
				return fichePatientRepo.findById(id).get();
			}
			@Override
			public  FichePatient retrieveFichePatient(String id) {
				// TODO Auto-generated method stub
				FichePatient r = fichePatientRepo.findById(Long.parseLong(id)).get();
			//	L.info("RendezVous returned : " + r);
				return r; 
			}


			
			
			
		}

	
	

