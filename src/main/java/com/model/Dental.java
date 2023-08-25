package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dental {
	
	@Id
	private int did;
	private String dname;
	private String demail;
	private String dtype;
	private String dspecialization;
	
	@ManyToOne
	@JoinColumn(name = "payment_id")
	private Payment payment;

	
	public Dental() {
		super();
	}

	
	public Dental(int did, String dname, String demail, String dtype, String dspecialization, Payment payment) {
		super();
		this.did = did;
		this.dname = dname;
		this.demail = demail;
		this.dtype = dtype;
		this.dspecialization = dspecialization;
		this.payment = payment;
	}


	public Dental(int did, String dname, String demail, String dtype, String dspecialization) {
		super();
		this.did = did;
		this.dname = dname;
		this.demail = demail;
		this.dtype = dtype;
		this.dspecialization = dspecialization;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDemail() {
		return demail;
	}

	public void setDemail(String demail) {
		this.demail = demail;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public String getDspecialization() {
		return dspecialization;
	}

	public void setDspecialization(String dspecialization) {
		this.dspecialization = dspecialization;
	}

	
	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	@Override
	public String toString() {
		return "Dental [did=" + did + ", dname=" + dname + ", demail=" + demail + ", dtype=" + dtype
				+ ", dspecialization=" + dspecialization + ", payment=" + payment + "]";
	}



	
	

}
