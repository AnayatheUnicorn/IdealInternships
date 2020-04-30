package com.example.idealinternships;

import java.util.Date;

public class Student {
    //Data
    private String firstName;
    private String lastName;
    //private int imageResource;
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
    //String email, String pass (to add in later), int image

    /**
     * Constructs a Student class with information to sort them with an internship
     * @param first the student's first name
     * @param last the student's last name
     * @param bio a short student bio to be displayed on their account page
     * @param age the student's age
     * @param gender the student's gender
     * @param race the student's race
     * @param school the student's school
     * @param milAssociation whether or not they are associated with the military
     * @param preferredField the field they prefer for their internship
     * @param location the student's location
     * @param income the student's family's income
     * @param startDate the start date for the window they are available for an internship
     * @param endDate the end date for the window they are available for an internship
     * @param push whether or not they want push notifications
     */
    public Student(String first, String last, String bio, String age, String gender, String race,
                   String school, boolean milAssociation, String preferredField, String location, String income, Date startDate,
                   Date endDate, boolean push){
        firstName = first;
        lastName = last;
        //imageResource = image;
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
     * A method to get the student's first name
     * @return a string with their first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * A method to set their first name if they wish to change it
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *A method to get the student's last name
     * @return a string with their last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *A method to set the student's last name
     * @param lastName their new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //**
     /* A method to get the number which corresponds to the image
     /* @return the integer corresponding to the drawable
     /*/
    //public int getImageResource(){return imageResource;}

    /**
    / * A method to set the number corresponding to an image
    / * @param image the new image corresponding integer
    / */
    //public void setImageResource(int image){this.imageResource = image;}

    /**
     *A method to get the student's email
     * @return a string with their email address
     */
    //public String getStudentEmail() {return studentEmail;}

    /**
    // * A method to set a new email address
    // * @param studentEmail their new email address
    // */
    //public void setStudentEmail(String studentEmail) {this.studentEmail = studentEmail;}

    /*
     *A method to get the student's password
     * @return the password to their account
     */
    //public String getPassword() {return password;}

    /*
     *A method to change the student's password
     * @param password their new password
     */
    //public void setPassword(String password) {this.password = password;}

    /*
     *A method to get the student's bio
     * @return the student's bio
     */
    public String getProfileBio() {
        return profileBio;
    }

    /*
     *A method to change the student's bio
     * @param profileBio their new bio
     */
    public void setProfileBio(String profileBio) {
        this.profileBio = profileBio;
    }

    /*
     *A method to get the student's age
     * @return the student's age as a String
     */
    public String getStudentAge() {
        return studentAge;
    }

    /*
     *A method to change the student's age
     * @param studentAge new student age
     */
    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    /*
     *A method to get the student's gender
     * @return the student's gender
     */
    public String getStudentGender() {
        return studentGender;
    }

    /**
     *A method to set the student's gender
     * @param studentGender the new gender
     */
    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    /**
     *A method to get the student's race
     * @return the race of the student
     */
    public String getStudentRace() {
        return studentRace;
    }

    /**
     *A method to set the student's race
     * @param studentRace the new race of the student
     */
    public void setStudentRace(String studentRace) {
        this.studentRace = studentRace;
    }

    /**
     *A method to get the student's school
     * @return the student's school
     */
    public String getStudentSchool() {
        return studentSchool;
    }

    /**
     *A method to change the student's school
     * @param studentSchool the new school
     */
    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }

    /**
     *A method to get whether or not the student has a military association
     * @return true if they are associated false if not
     */
    public boolean isMilitary() {
        return military;
    }

    /**
     *A method which sets whether they are associated with the military
     * @param military whether or not they are associated with the military
     */
    public void setMilitary(boolean military) {
        this.military = military;
    }

    /**
     *A method which gets the student's preferred internship field
     * @return A string with their field of interest
     */
    public String getField() {
        return field;
    }

    /**
     *A method which sets their preferred internship field
     * @param field their new field of interest
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     *A method which gets the students entered location
     * @return their entered location
     */
    public String getStudentLocation() {
        return studentLocation;
    }

    /**
     *A method which sets the student's new location
     * @param studentLocation the student's new location
     */
    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }

    /**
     *A method which gets the student's family's income
     * @return A string with their income bracket
     */
    public String getIncome() {
        return income;
    }

    /**
     *A method which sets the student's family's income
     * @param income their new income bracket
     */
    public void setIncome(String income) {
        this.income = income;
    }

    /**
     *A method which gets the date they are first available for an internship
     * @return a Date object representing the start date
     */
    public Date getStartPreferredDate() {
        return startPreferredDate;
    }

    /**
     *A method which sets the date they are first available for an internship
     * @param startPreferredDate the new start date of the window they are available
     */
    public void setStartPreferredDate(Date startPreferredDate) {
        this.startPreferredDate = startPreferredDate;
    }

    /**
     *A method which gets the end date of the window they are available
     * @return a Date object representing the end date of the window they are available
     */
    public Date getEndPreferredDate() {
        return endPreferredDate;
    }

    /**
     *A method which changes the end date of their available window
     * @param endPreferredDate a Date object of their new end date for their available window
     */
    public void setEndPreferredDate(Date endPreferredDate) {
        this.endPreferredDate = endPreferredDate;
    }

    /**
     *A method which gets whether the user wants notifications
     * @return a boolean signifiying true for yes and false for no
     */
    public boolean isNotifications() {
        return notifications;
    }

    /**
     *Sets whether the user wants notifications
     * @param notifications a boolean representing yes as true and no as false
     */
    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    /**
     * A method used for printing out the information of the student
     * @return A single string with all the student's data
     */
    public String toString(){
        String student = new String(firstName + " " + lastName + " Bio: " + profileBio + " Age: "
                + studentAge + " Gender: " + studentGender + " Race: " + studentRace + " School: " + studentSchool
                + " Mil: " + military + " Field: " + field + " Location: " + studentLocation + " Income: " +
                income + " Start Date: " + startPreferredDate + " End Date: " + endPreferredDate + " Push: " +
                notifications);
        return student;
    }
}
