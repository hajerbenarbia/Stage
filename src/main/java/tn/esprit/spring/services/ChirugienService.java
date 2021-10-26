package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Chirugien;


public interface ChirugienService {
	
	
	public 	List<Chirugien> retrieveAllChirugien();
	
	public 	 Chirugien addChirugien(Chirugien r) ;
			
		
		public void  deleteChirugien(String id) ;
		public  Chirugien updateChirugien(Chirugien chirugien);
			
		
		 public Chirugien retrieveChirugien(Long id);
		public  Chirugien retrieveChirugien(String id) ;


}



