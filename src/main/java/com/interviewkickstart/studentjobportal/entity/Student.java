package com.interviewkickstart.studentjobportal.entity;

import java.sql.Timestamp;

public class Student {

    private String id;
    private String name;
    private int age;
    private int experience;
    private String email;
    private String contactNum;
    private String college;
    private String city;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    public String getId() {
        return id;
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

    public void setId(String id){
        this.id = id;
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
