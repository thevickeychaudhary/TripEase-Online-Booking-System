package com.payment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	private String paymentId;
	private String bookingId;
	private String paymentMode; // e.g., UPI, Card, NetBanking
	private double amount;
	private String status; // e.g., SUCCESS, FAILED
}
