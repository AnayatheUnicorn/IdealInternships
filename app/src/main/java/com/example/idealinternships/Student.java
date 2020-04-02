package com.example.idealinternships;

import java.util.Date;

public class Student {
    //Data
    private String firstName;
    private String lastName;
    private String studentEmail;
    private String password;
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
    public Student(String first, String last, String email, String pass, String bio, int age, String gender, String race,
                   String school, boolean milAssociation, String preferredField, String location, String income, Date startDate,
                   Date endDate, boolean push){
        firstName = first;
        lastName = last;
        studentEmail = email;
        password = pass;
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

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileBio() {
        return profileBio;
    }

    public void setProfileBio(String profileBio) {
        this.profileBio = profileBio;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentRace() {
        return studentRace;
    }

    public void setStudentRace(String studentRace) {
        this.studentRace = studentRace;
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getStudentLocation() {
        return studentLocation;
    }

    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public Date getStartPreferredDate() {
        return startPreferredDate;
    }

    public void setStartPreferredDate(Date startPreferredDate) {
        this.startPreferredDate = startPreferredDate;
    }

    public Date getEndPreferredDate() {
        return endPreferredDate;
    }

    public void setEndPreferredDate(Date endPreferredDate) {
        this.endPreferredDate = endPreferredDate;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }
}
