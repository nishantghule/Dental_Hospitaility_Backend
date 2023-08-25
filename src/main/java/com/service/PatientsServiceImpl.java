package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PatientsRepo;
import com.model.Patients;

@Service
public class PatientsServiceImpl implements PatientsService {
	
	@Autowired
	PatientsRepo patientsrepo;

	@Override
	public Patients addPatients(Patients pat) {
		// TODO Auto-generated method stub
		return patientsrepo.save(pat);
	}

	@Override
	public List<Patients> getAllByPatients() {
		// TODO Auto-generated method stub
		return patientsrepo.findAll();
	}
	
	
	
	

}
