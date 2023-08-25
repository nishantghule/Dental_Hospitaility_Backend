package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patients {
	
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private long mobileno;
	
	public Patients() {
		super();
	}

	public Patients(int id, String firstname, String lastname, String email, long mobileno) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobileno = mobileno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Patients [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobileno=" + mobileno + "]";
	}

}
