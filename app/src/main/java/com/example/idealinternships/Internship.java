package com.example.idealinternships;
/**
 * This class stores information for a single internship.
 * @author Maxi Attiogbe 
 *
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class Internship {
	//Data
    private String name;
	private Date applicationDeadline;
	private Date startDate;
	private Date endDate;
	private Company company;
	private String cost;
	private String targetAge;
	private String minAge;
	private String maxAge;
	private String minGrade;
	private String maxGrade;
	private String targetGender;
	private String targetRace;
	private boolean militaryExperience;
	private boolean paid;
	private String field;
	private String location;
	private String targetIncome;
	private String preReqs;
	private String internshipLink;
	private String internshipDescription;


	
	//Constructor(s)
	/**
	 * Constructs a default Internship object with no application deadline,
	 * start date, end date, company, cost, or additional information
	 */
	public Internship() {
	    name = "";
		applicationDeadline = null;
		startDate = null;
		endDate = null;
		company = new Company();
		cost = "";
		targetAge = "";
		minAge = "";
		maxAge = "";
		minGrade = "";
		maxGrade = "";
		targetGender = "";
		targetRace = "";
		militaryExperience = false;
		paid = false;
		field = "";
		location = "";
		targetIncome = "";
		preReqs = "";
		internshipLink = "";
		internshipDescription = "";
	}


	/**
	 * Constructs an Internship object with  a given application deadline,
	 * start date, end date, company, cost, target age, target gender, target race,
	 * militaryExperience, field, location, and targetLocation
	 * @param name the name of the internship
	 * @param applicationDeadline the given application deadline
	 * @param startDate the given start date
	 * @param endDate the given end date
	 * @param company the company hosting the internship
	 * @param cost the cost
	 * @param targetGender the target gender
	 * @param targetRace the target race
	 * @param militaryExperience military experience
	 * @param field the internship field
	 * @param location the internship location
	 * @param targetIncome the target applicant income
	 * @param preReqs the pre-requisites
	 * @param internshipLink the internship link
	 * @param internshipDescription the internship Description
	 */
	public Internship(String name, Date applicationDeadline, Date startDate, Date endDate, Company company, String cost, String targetAge,
                      String minAge, String maxAge, String minGrade, String maxGrade, String targetGender, String targetRace, boolean militaryExperience, boolean paid, String field, String location, String targetIncome,
					  String preReqs, String internshipLink, String internshipDescription) {
		this.name = name;
	    this.applicationDeadline = applicationDeadline;
		this.startDate = startDate;
		this.endDate = endDate;
		this.company = company;
		this.cost = cost;
		this.targetAge = targetAge;
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.minGrade = minGrade;
		this.maxGrade = maxGrade;
		this.targetGender = targetGender;
		this.targetRace = targetRace;
		this.militaryExperience = militaryExperience;
		this.paid = paid;
		this.field = field;
		this.location = location;
		this.targetIncome = targetIncome;
		this.preReqs = preReqs;
		this.internshipLink = internshipLink;
		this.internshipDescription = internshipDescription;

	}
	//Methods

	/**
	 * Get the name of the internship
	 * @return the name of the internship
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the internship
	 * @param name the name of the internship
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the application deadline of the internship
	 * @return the application deadline of the internship
	 */
	public Date getApplicationDeadline() {
		return applicationDeadline;
	}

	/**
	 * Set the application deadline of the internship
	 * @param applicationDeadline the application deadline of the internship
	 */
	public void setApplicationDeadline(Date applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}

	/**
	 * Get the start date of the internship
	 * @return the start date of the internship
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Set the start date of the internship
	 * @param startDate the start date of the internship
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Get the end date of the internship
	 * @return the end date of the internship
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Set the end date of the internship
	 * @param endDate the end date of the internship
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Get the company hosting the internship
	 * @return the company hosting the internship
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * Set the company hosting the internship
	 * @param company the company hosting the internship
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * Get the cost of the internship
	 * @return the cost of the internship
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * Set the cost of the internship
	 * @param cost the cost of the internship
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * Get the minimum age for the internship
	 * @return the minimum age for the internship
	 */
	public String getMinAge() {
		return minAge;
	}

	/**
	 * Set the minimum age for the internship
	 * @param minAge the minimum age for the internship
	 */
	public void setMinAge(String minAge) {
		this.minAge = minAge;
	}

	/**
	 * Get the maximum age for the internship
	 * @return the maximum age for the internship
	 */
	public String getMaxAge() {
		return maxAge;
	}

	/**
	 * Set the maximum age for the internship
	 * @param maxAge the maximum age for the internship
	 */
	public void setMaxAge(String maxAge) {
		this.maxAge = maxAge;
	}

	/**
	 * Get the minimum grade for the internship
	 * @return the minimum grade for the internship
	 */
	public String getMinGrade() {
		return minGrade;
	}

	/**
	 * Set the minimum grade for the internship
	 * @param minGrade the minimum grade for the internship
	 */
	public void setMinGrade(String minGrade) {
		this.minGrade = minGrade;
	}

	/**
	 * Get the maximum grade for the internship
	 * @return the maximum grade for the internship
	 */
	public String getMaxGrade() {
		return maxGrade;
	}

	/**
	 * Set the maximum grade for the internship
	 * @param maxGrade the maximum grade for the internship
	 */
	public void setMaxGrade(String maxGrade) {
		this.maxGrade = maxGrade;
	}

	/**
	 * Get the target race for the internship
	 * @return the target race for the internship
	 */
	public String getTargetRace() {
		return targetRace;
	}

	/**
	 * Set the target race for the internship
	 * @param targetRace the target race for the internship
	 */
	public void setTargetRace(String targetRace) {
		this.targetRace = targetRace;
	}

	/**
	 * Get the target gender for the internship
	 * @return the target gender for the internship
	 */
	public String getTargetGender() {
		return targetGender;
	}

	/**
	 * Set the target gender for the internship
	 * @param targetGender the target gender for the internship
	 */
	public void setTargetGender(String targetGender) {
		this.targetGender = targetGender;
	}

	/**
	 * Get military experience needed for the internship
	 * @return military experience needed for the internship
	 */
	public boolean isMilitaryExperience() {
		return militaryExperience;
	}

	/**
	 * Set military experience needed for the internship
	 * @param militaryExperience military experience needed for the internship
	 */
	public void setMilitaryExperience(boolean militaryExperience) {
		this.militaryExperience = militaryExperience;
	}

    /**
     * Set if paid for te internship
     * @return if the internship pays the students
     */
	public boolean isPaid(){
	    return paid;
    }

    /**
     * Sets whether an internship pays a students
     * @param paid if tge internship pays the student
     */
    public void setPaid(boolean paid){
	    this.paid = paid;
    }

	/**
	 * Get the internship field
	 * @return the internship field
	 */
	public String getField() {
		return field;
	}

	/**
	 * Set the internship field
	 * @param field the internship field
	 */
	public void setField(String field) {
		this.field = field;
	}

	/**
	 * Get the internship location
	 * @return the internship location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Set the internship location
	 * @param location the internship location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Get the internship target income
	 * @return the internship target income
	 */
	public String getTargetIncome() {
		return targetIncome;
	}

	/**
	 * Set the internship target income
	 * @param targetIncome the internship target income
	 */
	public void setTargetIncome(String targetIncome) {
		this.targetIncome = targetIncome;
	}

	/**
	 * Get the internship pre-requisites
	 * @return the intersnhip pre-requisites
	 */
	public String getPreReqs(){return preReqs;}

	/**
	 * Set the internship pre-requisites
	 * @param preReqs the internship pre-requisites
	 */
	public void setPreReqs(String preReqs){this.preReqs = preReqs; }

	/**
	 * Get the internship link
	 * @return the internship link
	 */
	public String getInternshipLink(){return internshipLink;}

	/**
	 * Set the internship link
	 * @param internshipLink the internship link
	 */
	public void setInternshipLink(String internshipLink) {this.internshipLink = internshipLink;}

	/**
	 * Get the internship description
	 * @return the internship description
	 */
	public String getInternshipDescription() {return internshipDescription;}

	/**
	 * Set the internship description
	 * @param internshipDescription the internship description
	 */
	public void setInternshipDescription(String internshipDescription) {this.internshipDescription = internshipDescription;}

	/**
	 * Returns the company website's url if this Internship object has a Company object
	 * with a proper URL stored in its link String attribute
	 * @return the company website's url if this Internship object has a Company object
	 * 	with a proper URL stored in its link String attribute
	 */
	public URL learnMore(){
		if(getCompany() == null || getCompany().getLink().equals("")){
			return null;
		} else {
			URL url = null;
			try {
				url = new URL(getCompany().getLink());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			return url;
		}
	}

}