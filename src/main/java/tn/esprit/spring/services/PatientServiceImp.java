package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Patient;
import tn.esprit.spring.repositories.PatientRepo;

@Service
public class PatientServiceImp implements PatientService {

	@Autowired 
	PatientRepo patientRepo; 
	@Override
		public List<Patient> retrieveAllPatient() {
			// TODO Auto-generated method stub
			return (List<Patient>) patientRepo.findAll();
		}
	@Override
		public Patient addPatient(Patient r) {
			// TODO Auto-generated method stub
			return patientRepo.save(r);
		}

//		public void deleteRendezVous(Long idRendezVous) {
//			// TODO Auto-generated method stub
//			rendezVousRepo.deleteById(idRendezVous);
//		}
		@Override 
		public void deletePatient(String idPatient) {
			// TODO Auto-generated method stub
			patientRepo.deleteById(Long.parseLong(idPatient));
		}
		@Override
		public Patient updatePatient(Patient p) {
			// TODO Auto-generated method stub
			return patientRepo.save(p);
					
					
		}

		@Override
		public Patient retrievePatient(Long id) {
			// TODO Auto-generated method stub
			return patientRepo.findById(id).get();
		}
		@Override
		public Patient retrievePatient(String id) {
			// TODO Auto-generated method stub
			Patient p = patientRepo.findById(Long.parseLong(id)).get();
		//	L.info("RendezVous returned : " + r);
			return p; 
		}

	
	
}
