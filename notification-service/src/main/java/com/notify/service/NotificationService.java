package com.notify.service;



import org.springframework.stereotype.Service;

import com.notify.dto.NotificationRequest;

@Service
public class NotificationService {
    public String sendNotification(NotificationRequest request) {
        // Simulate sending email/SMS
        return "Notification sent to " + request.getTo() + " with subject: " + request.getSubject();
    }
}
