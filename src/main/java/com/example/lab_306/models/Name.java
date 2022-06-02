package com.example.lab_306.models;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String saludation;


    Name() {

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSaludation() {
        return saludation;
    }

    public void setSaludation(String saludation) {
        this.saludation = saludation;
    }

    public Name(String firstName, String lastName, String middleName, String saludation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.saludation = saludation;
    }
}
