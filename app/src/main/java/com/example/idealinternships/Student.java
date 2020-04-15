package com.example.idealinternships;

import java.util.Date;

public class Student {
    //Data
    private String firstName;
    private String lastName;
    //private String studentEmail;
    //private String password;
    private String profileBio;
    private String studentAge;
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
    //String email, String pass (to add in later)

    public Student(String first, String last, String bio, String age, String gender, String race,
                   String school, boolean milAssociation, String preferredField, String location, String income, Date startDate,
                   Date endDate, boolean push){
        firstName = first;
        lastName = last;
        //studentEmail = email;
        //password = pass;
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

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    //public String getStudentEmail() {return studentEmail;}

    /**
     *
     * @param studentEmail
     */
    //public void setStudentEmail(String studentEmail) {this.studentEmail = studentEmail;}

    /**
     *
     * @return
     */
    //public String getPassword() {return password;}

    /**
     *
     * @param password
     */
    //public void setPassword(String password) {this.password = password;}

    /**
     *
     * @return
     */
    public String getProfileBio() {
        return profileBio;
    }

    /**
     *
     * @param profileBio
     */
    public void setProfileBio(String profileBio) {
        this.profileBio = profileBio;
    }

    /**
     *
     * @return
     */
    public String getStudentAge() {
        return studentAge;
    }

    /**
     *
     * @param studentAge
     */
    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    /**
     *
     * @return
     */
    public String getStudentGender() {
        return studentGender;
    }

    /**
     *
     * @param studentGender
     */
    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    /**
     *
     * @return
     */
    public String getStudentRace() {
        return studentRace;
    }

    /**
     *
     * @param studentRace
     */
    public void setStudentRace(String studentRace) {
        this.studentRace = studentRace;
    }

    /**
     *
     * @return
     */
    public String getStudentSchool() {
        return studentSchool;
    }

    /**
     *
     * @param studentSchool
     */
    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }

    /**
     *
     * @return
     */
    public boolean isMilitary() {
        return military;
    }

    /**
     *
     * @param military
     */
    public void setMilitary(boolean military) {
        this.military = military;
    }

    /**
     *
     * @return
     */
    public String getField() {
        return field;
    }

    /**
     *
     * @param field
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     *
     * @return
     */
    public String getStudentLocation() {
        return studentLocation;
    }

    /**
     *
     * @param studentLocation
     */
    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }

    /**
     *
     * @return
     */
    public String getIncome() {
        return income;
    }

    /**
     *
     * @param income
     */
    public void setIncome(String income) {
        this.income = income;
    }

    /**
     *
     * @return
     */
    public Date getStartPreferredDate() {
        return startPreferredDate;
    }

    /**
     *
     * @param startPreferredDate
     */
    public void setStartPreferredDate(Date startPreferredDate) {
        this.startPreferredDate = startPreferredDate;
    }

    /**
     *
     * @return
     */
    public Date getEndPreferredDate() {
        return endPreferredDate;
    }

    /**
     *
     * @param endPreferredDate
     */
    public void setEndPreferredDate(Date endPreferredDate) {
        this.endPreferredDate = endPreferredDate;
    }

    /**
     *
     * @return
     */
    public boolean isNotifications() {
        return notifications;
    }

    /**
     *
     * @param notifications
     */
    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }
}
