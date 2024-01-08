package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    // Constructor that takes an ID and a role
 // Change the constructor in AdminUser class
    public AdminUser(int id, Integer employeeID, String role) {
        super(Integer.toString(id)); 
        this.employeeID = employeeID;
        this.role = role;
        this.securityIncidents = new ArrayList<>();
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

    // Implement HIPAACompliantAdmin interface
    @Override
    public boolean assignPIN() {
      
        return true; 
    }

    @Override
    public boolean deleteUserAccess() {
        
        return true; 
    }

    public void newIncident(String notes) {
        String report = String.format(
                "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n",
                new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format(
                "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n",
                new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

    // Setters & Getters
    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents() {
        return securityIncidents;
    }

    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }
}
