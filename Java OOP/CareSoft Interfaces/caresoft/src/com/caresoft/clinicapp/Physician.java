package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    private ArrayList<String> patientNotes;

    // Constructor that takes an ID
    public Physician(int id) {
        super(id);
        this.patientNotes = new ArrayList<>();
    }

    // Implement HIPAACompliantUser interface
    @Override
    public boolean accessPatientInfo() {
       
        return true; 
    }

    @Override
    public boolean verifyUserAuthentication() {
       
        return true; 
    }

    // Method for adding new patient notes
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
                "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // Setters & Getters
    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }
}
