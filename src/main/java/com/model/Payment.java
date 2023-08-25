package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	private int id;
	private String email;
	private String name;
	private String city;
	private String state;
	
	public Payment() {
		super();
	}

	public Payment(int id, String email, String name, String city, String state) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", email=" + email + ", name=" + name + ", city=" + city + ", state=" + state
				+ "]";
	}
		
	
	
	
	

}
