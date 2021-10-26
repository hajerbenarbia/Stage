package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Chirugien;
import tn.esprit.spring.repositories.ChirugienRepo;


@Service
public class ChirugienServiceImp  implements ChirugienService {

	@Autowired 
	ChirugienRepo chirugienRepo; 
	@Override
	
	public List<Chirugien> retrieveAllChirugien() {
		// TODO Auto-generated method stub
		return (List<Chirugien>) chirugienRepo.findAll();
	}
@Override
	public Chirugien addChirugien(Chirugien a) {
		// TODO Auto-generated method stub
		return chirugienRepo.save(a);
	}

	@Override 
	public void deleteChirugien(String idChirugien) {
		// TODO Auto-generated method stub
		chirugienRepo.deleteById(Long.parseLong(idChirugien));
	}
	@Override
	public Chirugien updateChirugien(Chirugien a) {
		// TODO Auto-generated method stub
		return chirugienRepo.save(a);
				
				
	}

	@Override
	public Chirugien retrieveChirugien(Long id) {
		// TODO Auto-generated method stub
		return chirugienRepo.findById(id).get();
	}
	@Override
	public Chirugien retrieveChirugien(String id) {
		// TODO Auto-generated method stub
		Chirugien a = chirugienRepo.findById(Long.parseLong(id)).get();
	
		return a; 
	}


}
