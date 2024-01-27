package com.example.challenge01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.challenge01.Service.CitizenService;
import com.example.challenge01.entity.Citizen;

@RestController
public class CitizenController {
	
	@Autowired
	CitizenService citizenService;
	
	@GetMapping("/citizens")
	public ResponseEntity<List<Citizen>> getAllCitizens() {
		return  ResponseEntity.ok().body(citizenService.getAllCitizens());
		
	}
	
	@PostMapping("/addCitizens")
	public ResponseEntity<Citizen> createCitizen(@RequestBody Citizen citizen){
		return ResponseEntity.ok().body(citizenService.createCitizen(citizen));
		
	}
	
	@PostMapping("/updateCitizen")
	ResponseEntity<Citizen> updateCitizen(@RequestBody Citizen citizen){
		
		
		return ResponseEntity.ok().body(citizenService.updateCitizen(citizen));
		
		
		
	}
	
	@PostMapping("/deleteCitizen")
	HttpStatus deleteCitizen(@RequestBody Citizen citizen){
		
		citizenService.deleteCitizen(citizen);
		return HttpStatus.OK;
		
		
		
	}
	
	

}
