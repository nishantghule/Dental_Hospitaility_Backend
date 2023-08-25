package com.service;

import java.util.List;

import com.model.Patients;

public interface PatientsService {
	
	Patients addPatients(Patients pat);
	
	List<Patients> getAllByPatients();


}
