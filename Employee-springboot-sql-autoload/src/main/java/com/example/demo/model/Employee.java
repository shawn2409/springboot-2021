package com.example.demo.model;


import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL",unique = true)
    private String email;

    @Column(name = "DOB")
    private String dob;

    @Column(name = "TITLE", length = 3)
    private String title;

    @Column(name = "DEPT_NAME")
    private String deptName;

//    public Employee(int id, String name, String email, String dob, String title, String deptName) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.dob = dob;
//        this.title = title;
//        this.deptName = deptName;
//    }
//
//public Employee(){
//
//}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
