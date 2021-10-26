package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Patient;

import tn.esprit.spring.repositories.PatientRepo;

import tn.esprit.spring.services.PatientService;


@RestController
public class RestControlPatient {

	@Autowired
	PatientService patientService;
	@Autowired 
	PatientRepo patientRepo;
	
	
	
	// http://localhost:8093/SpringMVC/servlet/retrieve-all-patient
		@GetMapping("/retrieve-all-patient")
		public List<Patient> patient() 
		{
			List<Patient> liste = patientService.retrieveAllPatient();
			return liste;
		}
		// http://localhost:8093/SpringMVC/servlet/retrieve-patient/{patient-id}
		@GetMapping("/retrieve-patient/{idPatient}")
		public Patient retrievePatient(@PathVariable("idPatient") String idPatient)
		{
			return patientService.retrievePatient(idPatient);
		}
		
		// http://localhost:8093/SpringMVC/servlet/add-patient
		@PostMapping("/add-patient")
		public Patient addPatient(@RequestBody Patient r ) 
		{
			Patient Patient = patientService.addPatient(r);
			return Patient ;
		}
		
		//http://localhost:8093/SpringMVC/servlet/remove-patient/{idPatient}
		
	 @DeleteMapping("remove-patient/{idPatient}")
		public void removepatient(@PathVariable("idPatient") String idPatient)
		{
		patientService.deletePatient(idPatient);
		}
		
		@DeleteMapping("/delete/{iddd}")
	    public ResponseEntity<String> deletePatient(@PathVariable("id") Long iddd) {
	        patientRepo.deleteById(iddd);
	        return new ResponseEntity<>("Patient has been deleted!", HttpStatus.OK);
	    }
		

		
		//http://localhost:8093/SpringMVC/servlet/modify-Patient
		@PutMapping("/modify-Patient")
		public Patient modifyPatient(@RequestBody Patient Patient )
		{
			return patientService.updatePatient(Patient);
		}
		

		@PutMapping("/modify-Patient/{id}")
		public Patient updatePatient(@PathVariable("id") long id, @RequestBody Patient patient) {
			patient.setIdPatient(id);
			return patientRepo.save(patient);
		}
		
	
}
