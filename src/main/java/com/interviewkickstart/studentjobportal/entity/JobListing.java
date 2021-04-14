package com.interviewkickstart.studentjobportal.entity;

import java.sql.Timestamp;

public class JobListing {

    private String id;
    private String company;
    private String location;
    private int reqExperience;
    private String description;
    private String type;
    private String contactHR;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private boolean isActive;

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getType() {
        return type;
    }

    public int getReqExperience() {
        return reqExperience;
    }

    public String getCompany() {
        return company;
    }

    public String getContactHR() {
        return contactHR;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setContactHR(String contactHR) {
        this.contactHR = contactHR;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setReqExperience(int reqExperience) {
        this.reqExperience = reqExperience;
    }

}


