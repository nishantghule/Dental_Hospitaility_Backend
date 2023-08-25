package com.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Serv {
	
	@Id

	private int id;
	private String service;
	
    @ManyToOne
    private Dental dental;
    
    @OneToOne
	private Patients patients; 

	
	public Serv() {
		super();
	}

	
	
	public Serv(int id, String service, Dental dental, Patients patients) {
		super();
		this.id = id;
		this.service = service;
		this.dental = dental;
		this.patients = patients;
	}



	public Serv(int id, String service, Dental dental) {
		super();
		this.id = id;
		this.service = service;
		this.dental = dental;
	}


	public Serv(int id, String service) {
		super();
		this.id = id;
		this.service = service;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}


	public Dental getDental() {
		return dental;
	}


	public void setDental(Dental dental) {
		this.dental = dental;
	}
	
	


	public Patients getPatients() {
		return patients;
	}



	public void setPatients(Patients patients) {
		this.patients = patients;
	}



	@Override
	public String toString() {
		return "Serv [id=" + id + ", service=" + service + ", dental=" + dental + ", patients=" + patients + "]";
	}



	
	
	
	

}
