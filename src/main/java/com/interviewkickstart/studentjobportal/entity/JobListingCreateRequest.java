package com.interviewkickstart.studentjobportal.entity;

public class JobListingCreateRequest {

    private String jobId;
    private String company;
    private String location;
    private int reqExperience;
    private String description;
    private String type;
    private String contactHR;

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

    public String getJobId() {
        return jobId;
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

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setReqExperience(int reqExperience) {
        this.reqExperience = reqExperience;
    }

    public void setType(String type) {
        this.type = type;
    }
}
