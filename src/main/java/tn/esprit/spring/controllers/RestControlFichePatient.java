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

import tn.esprit.spring.entities.FichePatient;
import tn.esprit.spring.repositories.FichePatientRepo;
import tn.esprit.spring.services.FichePatientService;

@RestController
public class RestControlFichePatient {

	
	@Autowired
	FichePatientService fichePatientService;
	@Autowired 
	FichePatientRepo fichePatientRepo;
	
	

	// http://localhost:8093/SpringMVC/servlet/retrieve-all-fichePatient
	@GetMapping("/retrieve-all-fichePatient")
	public List<FichePatient> fichePatient() 
	{
		List<FichePatient> liste = fichePatientService.retrieveAllFichePatient();
		return liste;
	}
	// http://localhost:8093/SpringMVC/servlet/retrieve-fichePatient/{idFichePatient}
	@GetMapping("/retrieve-fichePatient/{idFichePatient}")
	public FichePatient retrieveFichePatient(@PathVariable("idFichePatient") String idFichePatient)
	{
		return fichePatientService.retrieveFichePatient(idFichePatient);
	}
	//http://localhost:8093/SpringMVC/servlet/remove-fichePatient/retrieve-fichePatient
	@GetMapping("/retrieve-FichePatient")
	public FichePatient retrieveFichePatient1(@RequestParam("idFichePatient") String idFichePatient)
	{
		return fichePatientService.retrieveFichePatient(idFichePatient);
	}
	// http://localhost:8093/SpringMVC/servlet/add-fichePatient
	@PostMapping("/add-fichePatient")
	public FichePatient addFichePatient(@RequestBody FichePatient r ) 
	{
		FichePatient FichePatient = fichePatientService.addFichePatient(r);
		return FichePatient ;
	}
	
	//http://localhost:8093/SpringMVC/servlet/remove-fichePatient/{idFichePatient}
	
 @DeleteMapping("remove-fichePatient/{idFichePatient}")
	public void removefichePatient(@PathVariable("idFichePatient") String idFichePatient)
	{
	 fichePatientService.deleteFichePatient(idFichePatient);
	}
	
	@DeleteMapping("/delete/{idd}")
    public ResponseEntity<String> deleteFichePatient(@PathVariable("idd") Long idd) {
        fichePatientRepo.deleteById(idd);
        return new ResponseEntity<>("fiche Patient has been deleted!", HttpStatus.OK);
    }
	
	
//	@DeleteMapping("/deleteRendezVousById/{idRendezVous}")
//	@ResponseBody
//	public void deleteRendezVous(@PathVariable("idRendezVous") Long idRendezVous) {
//	service.deleteRendezVous(idRendezVous);
//	}
	
	//http://localhost:8093/SpringMVC/servlet/modify-fichePatient
	@PutMapping("/modify-fichePatient")
	public FichePatient modifyFichePatient(@RequestBody FichePatient FichePatient )
	{
		return fichePatientService.updateFichePatient(FichePatient);
	}
	

	@PutMapping("/modify-fichePatient/{id}")
	public FichePatient updateFichePatient(@PathVariable("id") long id, @RequestBody  FichePatient  fichePatient) {
		 fichePatient.setIdFichePatient(id);
		return fichePatientRepo.save(fichePatient);
	}
	
	
}
