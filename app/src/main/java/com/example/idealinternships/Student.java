package com.example.idealinternships;

public class Student {
    //Data
    private String firstName;
    private String lastName;
    private String profileBio;//not required
    private int studentAge;
    private String studentGender;
    private String studentRace;
    private String studentSchool;
    private boolean military;
    private String field;
    private String location;//not required
    private String income;//not required
    //how do we handle preferred dates? do they need to be their own object? might be smart to have a date class
    //private Date startPreferredDate;
    //private Date endPreferredDate;
    private boolean notifications;

    //Constructor
    public Student(String first, String last, int age, String gender, String race, String school, boolean milAssociation,String preferredField){
        firstName = first;
        lastName = last;
        studentAge = age;
        studentGender = gender;
        studentRace = race;
        studentSchool = school;
        military = milAssociation;
        field = preferredField;
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
        this.location = location;
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
        return location;
    }

    public String getIncome() {
        return income;
    }

    public boolean isNotifications() {
        return notifications;
    }
}
