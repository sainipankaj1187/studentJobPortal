package com.interviewkickstart.studentjobportal.service;

import com.interviewkickstart.studentjobportal.db.JobListingJDBCRepositary;
import com.interviewkickstart.studentjobportal.entity.JobListing;
import com.interviewkickstart.studentjobportal.entity.JobListingCreateRequest;
import com.interviewkickstart.studentjobportal.entity.JobListingSearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.UUID;

@Service
public class JobListingService {

    @Autowired
    private JobListingJDBCRepositary jobListingJDBCRepositary;
    public JobListing createJobListing(JobListingCreateRequest request){

        JobListing jobListing = createJobListingFromRequest(request);
        jobListingJDBCRepositary.insert(jobListing);
        return jobListing;
    }

    public Object searchJobListings(JobListingSearchRequest request){

        return jobListingJDBCRepositary.searchJobListings(request);
    }


    public JobListing createJobListingFromRequest(JobListingCreateRequest createRequest){
        JobListing jobListing = new JobListing();
        jobListing.setId(UUID.randomUUID().toString());
        jobListing.setCompany(createRequest.getCompany());
        jobListing.setLocation(createRequest.getLocation());
        jobListing.setReqExperience(createRequest.getReqExperience());
        jobListing.setDescription(createRequest.getDescription());
        jobListing.setType(createRequest.getType());
        jobListing.setContactHR(createRequest.getContactHR());
        jobListing.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        jobListing.setUpdatedDate(new Timestamp(System.currentTimeMillis()));
        jobListing.setIsActive(true);

        return jobListing;

    }
}
