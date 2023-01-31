package com.example.testspringfridayweb.model;


import org.hibernate.Session;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;



@Entity
@Table(name = "employee")
public class Employee {
    public Session Repository;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name ")
    private String lastName;
    @Column(name = "email_id")
    private String emailId;

    @Override
    public String toString() {
        return "Employee{" +
                "Repository=" + Repository +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public Session getRepository() {
        return Repository;
    }

    public void setRepository(Session repository) {
        Repository = repository;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}


