
package com.tech.blog.entities;

import java.sql.Timestamp;

public class User {


    
    
    private int id;
    private String name;
    private String email;
    private String about;
    private String passowrd;
    private String gender;
    private Timestamp datetime;

    public User(int id, String name, String email, String about, String passowrd, String gender, Timestamp datetime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.about = about;
        this.passowrd = passowrd;
        this.gender = gender;
        this.datetime = datetime;
    }
    public User() {
    }

    public User(String name, String email, String about, String passowrd, String gender) {
        this.name = name;
        this.email = email;
        this.about = about;
        this.passowrd = passowrd;
        this.gender = gender;
       // this.datetime = datetime;
    }
    
//    getter and setter
    
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

   
}
