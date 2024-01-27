package com.example.challenge01.Service;

import java.util.List;

import com.example.challenge01.entity.Citizen;

public interface CitizenService {
	
	Citizen createCitizen(Citizen citizen);
	List<Citizen> getAllCitizens();
	Citizen updateCitizen(Citizen citizen);
	void deleteCitizen(Citizen citizen);
	
	

}
