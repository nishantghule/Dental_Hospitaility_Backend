package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Payment;
import com.service.PaymentService;

@CrossOrigin(origins="http://localhost:4200")

@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentservice;
	
	@PostMapping("/addpayment")
	public Payment addPayment(@RequestBody Payment payment) {
		
		return paymentservice.addPayment(payment);
	}
	
	@GetMapping("/getall")
	public List<Payment> getAllPayments() {
		
		return paymentservice.getAllPayments();
	}

}
