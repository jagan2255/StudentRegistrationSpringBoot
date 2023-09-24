package com.example.studentRegistrationSpring.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "students")

public class StudentEntity {

    @Id
    private String _id;
    private String name;
    private String className;
    private String division;
    private Date dob;
    private String gender;


    public StudentEntity(String _id, String name, String className, String division, Date dob, String gender) {
        this._id = _id;
        this.name = name;
        this.className = className;
        this.division = division;
        this.dob = dob;
        this.gender = gender;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
