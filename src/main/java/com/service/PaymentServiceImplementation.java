package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PaymentRepo;
import com.model.Payment;

@Service
public class PaymentServiceImplementation implements PaymentService {
	
	@Autowired
	PaymentRepo paymentrepo;

	@Override
	public Payment addPayment(Payment payment) {
		
		return paymentrepo.save(payment);
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return paymentrepo.findAll();
	}
	
	

}
