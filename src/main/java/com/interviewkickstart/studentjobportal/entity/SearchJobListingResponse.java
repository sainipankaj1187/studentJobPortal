package com.interviewkickstart.studentjobportal.entity;

import java.util.List;

public class SearchJobListingResponse {
    private List<JobListing> jobList;

    public List<JobListing> getJobList() {
        return jobList;
    }

    public void setJobList(List<JobListing> jobList) {
        this.jobList = jobList;
    }
}
