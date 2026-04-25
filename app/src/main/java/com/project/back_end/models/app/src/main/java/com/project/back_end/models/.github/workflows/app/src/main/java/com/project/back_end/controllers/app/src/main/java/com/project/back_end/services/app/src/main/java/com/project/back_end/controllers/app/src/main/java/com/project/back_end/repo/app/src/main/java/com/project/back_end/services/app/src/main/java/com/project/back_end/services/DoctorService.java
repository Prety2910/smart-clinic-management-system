package com.project.back_end.services;

import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    public String getAvailableSlots(String date) {
        return "Available slots on " + date;
    }

    public String login(String email, String password) {
        return "Login successful";
    }
}
