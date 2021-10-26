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
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Chirugien;
import tn.esprit.spring.entities.Patient;
import tn.esprit.spring.repositories.ChirugienRepo;
import tn.esprit.spring.services.ChirugienService;

@RestController
public class RestControlChirugien {

	@Autowired
	ChirugienService chirugienService;
	@Autowired 
	ChirugienRepo chirugienRepo;

	

	// http://localhost:8093/SpringMVC/servlet/retrieve-all-chirugien
		@GetMapping("/retrieve-all-chirugien")
		public List<Chirugien> chirugien() 
		{
			List<Chirugien> liste = chirugienService.retrieveAllChirugien();
			return liste;
		}
		// http://localhost:8093/SpringMVC/servlet/retrieve-chirugien/{chirugien-id}
		@GetMapping("/retrieve-chirugien/{idChirugien}")
		public Chirugien retrieveChirugien(@PathVariable("idChirugien") String idChirugien)
		{
			return chirugienService.retrieveChirugien(idChirugien);
		}
		
		// http://localhost:8093/SpringMVC/servlet/add-chirugien
		@PostMapping("/add-chirugien")
		public Chirugien addChirugien(@RequestBody Chirugien r ) 
		{
			Chirugien Chirugien = chirugienService.addChirugien(r);
			return Chirugien ;
		}
		
		//http://localhost:8093/SpringMVC/servlet/remove-chirugien/{idChirugien}
		
	 @DeleteMapping("remove-chirugien/{idChirugien}")
		public void removechirugien(@PathVariable("idChirugien") String idChirugien)
		{
		 chirugienService.deleteChirugien(idChirugien);
		}
		
		@DeleteMapping("/delete/{idddd}")
	    public ResponseEntity<String> deleteChirugien(@PathVariable("id") Long idddd) {
			chirugienRepo.deleteById(idddd);
	        return new ResponseEntity<>("Chirugien has been deleted!", HttpStatus.OK);
	    }
		

		
		//http://localhost:8093/SpringMVC/servlet/modify-Chirugien
		@PutMapping("/modify-Chirugien")
		public Chirugien modifyChirugien(@RequestBody Chirugien Chirugien )
		{
			return chirugienService.updateChirugien(Chirugien);
		}
		

		@PutMapping("/modify-Chirugien/{id}")
		public Chirugien updateChirugien(@PathVariable("id") long id, @RequestBody Chirugien chirugien) {
			chirugien.setIdChirugien(id);
			return  chirugienRepo.save(chirugien);
		}
		
	

	
	
}
