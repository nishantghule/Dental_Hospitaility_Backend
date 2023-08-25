package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Patients;

public interface PatientsRepo extends JpaRepository<Patients, Integer> {

}
