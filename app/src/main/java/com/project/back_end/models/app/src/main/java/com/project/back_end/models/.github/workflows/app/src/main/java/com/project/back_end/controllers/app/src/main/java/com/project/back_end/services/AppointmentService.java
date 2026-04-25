package com.project.back_end.services;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    public String bookAppointment() {
        return "Appointment booked successfully";
    }

    public String getAppointmentsByDoctorAndDate(String doctor, String date) {
        return "Appointments for doctor on date";
    }
}
