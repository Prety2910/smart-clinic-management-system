# Database Schema

## Patient
- id (INT, PK)
- name (VARCHAR)
- email (VARCHAR)
- phone (VARCHAR)

## Doctor
- id (INT, PK)
- name (VARCHAR)
- speciality (VARCHAR)

## Appointment
- id (INT, PK)
- patient_id (INT, FK)
- doctor_id (INT, FK)
- appointment_time (DATETIME)

## Prescription
- id (INT, PK)
- appointment_id (INT, FK)
- medication (TEXT)
