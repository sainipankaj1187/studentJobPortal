package com.interviewkickstart.studentjobportal.service;

import com.interviewkickstart.studentjobportal.db.StudentJDBCRepositary;
import com.interviewkickstart.studentjobportal.entity.Student;
import com.interviewkickstart.studentjobportal.entity.StudentCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    private StudentJDBCRepositary studentJDBCRepositary;

    public Student createStudent(StudentCreateRequest request){

        Student student =  createStudentFromRequest(request);
        studentJDBCRepositary.insert(student);
        return student;

    }

    /*public  Student getStudentDetails(String studentId){
        if(null == studentId || studentId.isEmpty()){
            throw  new RuntimeException("Invalid student Id");
        }

        return null;
    }*/

    private Student createStudentFromRequest(StudentCreateRequest createRequest){

        Student studentObj = new Student();
        studentObj.setId(UUID.randomUUID().toString());
        studentObj.setName(createRequest.getName());
        studentObj.setAge(createRequest.getAge());
        studentObj.setExperience(createRequest.getExperience());
        studentObj.setContactNum(createRequest.getContactNum());
        studentObj.setEmail(createRequest.getEmail());
        studentObj.setCollege(createRequest.getCollege());
        studentObj.setCity(createRequest.getCity());
        studentObj.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        studentObj.setUpdatedDate(new Timestamp(System.currentTimeMillis()));

        return studentObj;
    }
}
