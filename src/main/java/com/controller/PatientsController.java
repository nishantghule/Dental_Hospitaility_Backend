package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Patients;
import com.service.PatientsService;

@CrossOrigin(origins="http://localhost:4200")


@RestController
public class PatientsController {
	
	@Autowired
	PatientsService patientsservice;
	
	@PostMapping("/addpat")
	public Patients addPatients(@RequestBody Patients pat) {
		
		return patientsservice.addPatients(pat);
	}
	
	@GetMapping("/getallpatients")
	public List<Patients> getAllByPatients() {
		
		return patientsservice.getAllByPatients();
				
	}

	

}
