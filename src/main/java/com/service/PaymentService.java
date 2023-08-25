package com.service;

import java.util.List;

import com.model.Payment;

public interface PaymentService {
	
    Payment addPayment(Payment payment);
    
    List<Payment> getAllPayments();


}
