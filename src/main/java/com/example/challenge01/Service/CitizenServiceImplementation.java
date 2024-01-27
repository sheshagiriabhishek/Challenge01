package com.example.challenge01.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.challenge01.Repository.CitizenRepository;
import com.example.challenge01.entity.Citizen;

@Service
@Transactional
public class CitizenServiceImplementation implements CitizenService{
	
	@Autowired
	private CitizenRepository citizenRepo;

	@Override
	public Citizen createCitizen(Citizen citizen) {
		// TODO Auto-generated method stub
		
		return citizenRepo.save(citizen);
	}
	
	public List<Citizen> getAllCitizens(){
		
		return this.citizenRepo.findAll();
		
		
	}
	
	@Override
	public Citizen updateCitizen(Citizen citizen) {
		// TODO Auto-generated method stub
		
		
		
		citizenRepo.deleteById(citizen.getId());
		Citizen newCitizen = new Citizen(citizen.getId(), citizen.getName());
		return citizenRepo.save(newCitizen);
	}
	
	@Override
	public void deleteCitizen(Citizen citizen) {
		// TODO Auto-generated method stub
		citizenRepo.delete(citizen);
	
}
}
