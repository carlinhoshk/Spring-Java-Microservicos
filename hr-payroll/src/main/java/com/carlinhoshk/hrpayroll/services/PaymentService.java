package com.carlinhoshk.hrpayroll.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlinhoshk.hrpayroll.entities.Payment;
import com.carlinhoshk.hrpayroll.entities.Worker;
import com.carlinhoshk.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
	
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
		
	}

}
