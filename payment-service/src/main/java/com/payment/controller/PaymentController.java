package com.payment.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.Payment;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@GetMapping
	public List<Payment> getAllPayments() {
		return List.of(new Payment(UUID.randomUUID().toString(), "BOOK123", "UPI", 1500.0, "SUCCESS"),
				new Payment(UUID.randomUUID().toString(), "BOOK124", "CARD", 2000.0, "FAILED"));
	}

	@PostMapping
	public String makePayment(@RequestBody Payment payment) {
		return "Payment received for Booking ID: " + payment.getBookingId();
	}
}
