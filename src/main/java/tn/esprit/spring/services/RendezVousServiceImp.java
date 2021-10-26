package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.RendezVous;
import tn.esprit.spring.repositories.RendezVousRepo;

@Service
public  class RendezVousServiceImp  implements RendezVousService {
@Autowired 
RendezVousRepo rendezVousRepo; 
@Override
	public List<RendezVous> retrieveAllRDVS() {
		// TODO Auto-generated method stub
		return (List<RendezVous>) rendezVousRepo.findAll();
	}
@Override
	public RendezVous addRendezVous(RendezVous r) {
		// TODO Auto-generated method stub
		return rendezVousRepo.save(r);
	}

//	public void deleteRendezVous(Long idRendezVous) {
//		// TODO Auto-generated method stub
//		rendezVousRepo.deleteById(idRendezVous);
//	}
	@Override 
	public void deleteRendezVous(String idRendezVous) {
		// TODO Auto-generated method stub
		rendezVousRepo.deleteById(Long.parseLong(idRendezVous));
	}
	@Override
	public RendezVous updateRendezVous(RendezVous r) {
		// TODO Auto-generated method stub
		return rendezVousRepo.save(r);
				
				
	}

	@Override
	public RendezVous retrieveRendezVous(Long id) {
		// TODO Auto-generated method stub
		return rendezVousRepo.findById(id).get();
	}
	@Override
	public RendezVous retrieveRendezVous(String id) {
		// TODO Auto-generated method stub
	    RendezVous r = rendezVousRepo.findById(Long.parseLong(id)).get();
	//	L.info("RendezVous returned : " + r);
		return r; 
	}


	
	
	
}
