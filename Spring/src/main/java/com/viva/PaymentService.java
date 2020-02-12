package com.viva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	
	public PaymentService(PaymentRepository paymentRepository){
		this.paymentRepository = paymentRepository;
	}

	public void execute() {
		paymentRepository.execute();
		System.out.println("Execute method in PaymentService");
		
	}
}
