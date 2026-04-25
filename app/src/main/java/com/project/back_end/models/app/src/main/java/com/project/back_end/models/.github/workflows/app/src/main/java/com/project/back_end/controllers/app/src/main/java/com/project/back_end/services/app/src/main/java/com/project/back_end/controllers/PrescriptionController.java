package com.project.back_end.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @PostMapping
    public ResponseEntity<String> createPrescription(@RequestBody String body) {
        return ResponseEntity.ok("Prescription saved");
    }
}
