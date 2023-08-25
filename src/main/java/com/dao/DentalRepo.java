package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Dental;

public interface DentalRepo extends JpaRepository<Dental, Integer> {
	
	Dental findByDemail(String e);
	
	Dental findByDname(String name);


}
