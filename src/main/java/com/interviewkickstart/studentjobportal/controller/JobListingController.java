package com.interviewkickstart.studentjobportal.controller;

import com.interviewkickstart.studentjobportal.entity.*;
import com.interviewkickstart.studentjobportal.service.JobListingService;
import com.interviewkickstart.studentjobportal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class JobListingController {

    @Autowired
    private JobListingService jobListingService;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/jobportal/joblisting/v1/create", method = RequestMethod.POST)
    public @ResponseBody JobListing createNewJobListing(@RequestBody JobListingCreateRequest request){
        return jobListingService.createJobListing(request);
    }


    @RequestMapping(value = "/jobportal/student/v1/create", method = RequestMethod.POST)
    public @ResponseBody Student createStudent(@RequestBody StudentCreateRequest request){
        return studentService.createStudent(request);
    }

    @RequestMapping(value = "/jobportal/joblisting/v1/search", method = RequestMethod.POST)
    public @ResponseBody Object searchJobListings(@RequestBody JobListingSearchRequest request){
        return jobListingService.searchJobListings(request);
    }
}
