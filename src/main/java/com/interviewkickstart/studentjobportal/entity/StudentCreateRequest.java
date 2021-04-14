package com.interviewkickstart.studentjobportal.entity;

public class StudentCreateRequest {

    private String studentId;
    private String name;
    private int age;
    private int experience;
    private String email;
    private String contactNum;
    private String college;
    private String city;

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public String getCity() {
        return city;
    }

    public String getCollege() {
        return college;
    }

    public String getContactNum() {
        return contactNum;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String id){
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }



}
