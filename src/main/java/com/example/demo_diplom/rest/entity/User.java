package com.example.demo_diplom.rest.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column (name = "firstName")
    private String firstName;

    @Column (name = "lastName")
    private String lastName;

    @Column(name = "dateOfBirthday")
    private Date dateOfBirthday;


    public User() {
    }

    public User(String email, String firstName, String lastName, Date dateOfBirthday) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
}
