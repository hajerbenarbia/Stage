package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Patient;



@Repository
public interface PatientRepo  extends CrudRepository<Patient , Long>{

	
}
