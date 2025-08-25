package com.notify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notify.dto.NotificationRequest;
import com.notify.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

	@Autowired
	private NotificationService notificationService;

	@PostMapping
	public String send(@RequestBody NotificationRequest request) {
		return notificationService.sendNotification(request);
	}
	@GetMapping("/ping")
	public String ping() {
		return "Notification Service is UP";
	}
}
