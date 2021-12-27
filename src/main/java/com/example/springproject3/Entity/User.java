package com.example.springproject3.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastname;

    public User(){
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}