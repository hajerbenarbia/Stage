package tn.esprit.spring.controllers;


import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.entities.RendezVous;
import tn.esprit.spring.repositories.RendezVousRepo;
import tn.esprit.spring.services.RendezVousService;

@RestController
public class RestControlRendezVous {
	@Autowired
	RendezVousService rendezVousService;
	@Autowired 
	RendezVousRepo rendezVousRepo;
	
	
	// http://localhost:8093/SpringMVC/servlet/retrieve-all-rendezVous
	@GetMapping("/retrieve-all-rendezVous")
	public List<RendezVous> rendezVous() 
	{
		List<RendezVous> liste = rendezVousService.retrieveAllRDVS();
		return liste;
	}
	// http://localhost:8093/SpringMVC/servlet/retrieve-rdv/{rdv-id}
	@GetMapping("/retrieve-rendezVous/{idRendezVous}")
	public RendezVous retrieveRendezVous(@PathVariable("idRendezVous") String idRendezVous)
	{
		return rendezVousService.retrieveRendezVous(idRendezVous);
	}
	//http://localhost:8093/SpringMVC/servlet/remove-rdv/retrieve-rdv
	@GetMapping("/retrieve-RendezVous")
	public RendezVous retrieveRendezVous1(@RequestParam("idRendezVous") String idRendezVous)
	{
		return rendezVousService.retrieveRendezVous(idRendezVous);
	}
	// http://localhost:8093/SpringMVC/servlet/add-rendezVous
	@PostMapping("/add-rendezVous")
	public RendezVous addRendezVous(@RequestBody RendezVous r ) 
	{
		RendezVous RendezVous = rendezVousService.addRendezVous(r);
		return RendezVous ;
	}
	
	//http://localhost:8093/SpringMVC/servlet/remove-RDV/{idRendezVous}
	
 @DeleteMapping("remove-RDV/{idRendezVous}")
	public void removeRDV(@PathVariable("idRendezVous") String idRendezVous)
	{
	 rendezVousService.deleteRendezVous(idRendezVous);
	}
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRendez(@PathVariable("id") Long id) {
        rendezVousRepo.deleteById(id);
        return new ResponseEntity<>("rendez-vous has been deleted!", HttpStatus.OK);
    }
	

	
	//http://localhost:8093/SpringMVC/servlet/modify-RDV
	@PutMapping("/modify-RDV")
	public RendezVous modifyRDV(@RequestBody RendezVous RendezVous )
	{
		return rendezVousService.updateRendezVous(RendezVous);
	}
	

	@PutMapping("/modify-RDV/{id}")
	public RendezVous updateRendezVous(@PathVariable("id") long id, @RequestBody RendezVous rendezVous) {
		rendezVous.setIdRendezVous(id);
		return rendezVousRepo.save(rendezVous);
	}
	
}