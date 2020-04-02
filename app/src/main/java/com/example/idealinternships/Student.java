package com.example.idealinternships;

import java.util.Date;

public class Student {
    //Data
    private String firstName;
    private String lastName;
    private String profileBio;
    private int studentAge;
    private String studentGender;
    private String studentRace;
    private String studentSchool;
    private boolean military;
    private String field;
    private String studentLocation;
    private String income;
    private Date startPreferredDate;
    private Date endPreferredDate;
    private boolean notifications;

    //Constructor
    public Student(String first, String last, String bio, int age, String gender, String race, String school,
                   boolean milAssociation, String preferredField, String location, String income, Date startDate,
                   Date endDate, boolean push){
        firstName = first;
        lastName = last;
        profileBio = bio;
        studentAge = age;
        studentGender = gender;
        studentRace = race;
        studentSchool = school;
        military = milAssociation;
        field = preferredField;
        studentLocation = location;
        this.income = income;
        startPreferredDate = startDate;
        endPreferredDate = endDate;
        notifications = push;
    }

    //Methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setProfileBio(String profileBio) {
        this.profileBio = profileBio;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public void setStudentRace(String studentRace) {
        this.studentRace = studentRace;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setLocation(String location) {
        this.studentLocation = location;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProfileBio() {
        return profileBio;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public String getStudentRace() {
        return studentRace;
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public boolean isMilitary() {
        return military;
    }

    public String getField() {
        return field;
    }

    public String getLocation() {
        return studentLocation;
    }

    public String getIncome() {
        return income;
    }

    public boolean isNotifications() {
        return notifications;
    }
}
