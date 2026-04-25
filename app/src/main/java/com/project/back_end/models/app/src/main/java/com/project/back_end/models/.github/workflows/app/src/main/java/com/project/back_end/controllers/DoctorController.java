package com.project.back_end.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @GetMapping("/availability")
    public ResponseEntity<String> getAvailability(@RequestParam String date) {
        return ResponseEntity.ok("Available slots for date: " + date);
    }
}
