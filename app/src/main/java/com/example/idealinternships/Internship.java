package com.example.idealinternships;
/**
 * This class stores information for a single internship.
 * @author Maxi Attiogbe 
 *
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Date;

public class Internship {
	//Data
    private String name;
	private Date applicationDeadline;
	private Date startDate;
	private Date endDate;
	private Company company;
	private double cost;
	private String additionalInfo;

	
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
		cost = 0;
		additionalInfo = "";
	}

	/**
	 * Constructs an Internship object with  a given application deadline,
	 * 	start date, end date, company, cost, and additional information
     * 	@param name the name of the internship
     * @param applicationDeadline the given application deadline
	 * @param startDate the given start date
	 * @param endDate the given end date
	 * @param company the company hosting the internship
	 * @param cost the cost
	 * @param additionalInfo additional information about the internship for easier sorting and searching
	 */
	public Internship(String name, Date applicationDeadline, Date startDate, Date endDate, Company company, double cost, String additionalInfo) {
		this.name = name;
	    this.applicationDeadline = applicationDeadline;
		this.startDate = startDate;
		this.endDate = endDate;
		this.company = company;
		this.cost = cost;
		this.additionalInfo = additionalInfo;
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
	public double getCost() {
		return cost;
	}

	/**
	 * Set the cost of the internship
	 * @param cost the cost of the internship
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * Get additional information about the internship
	 * @return Get the cost of the internship
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * Set additional information about the internship
	 * @param additionalInfo additional information about the internship
	 */
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	/**
	 * Returns the company website's url if this Internship object has a Comapany object
	 * with a proper URL stored in its link String attribute
	 * @return the company website's url if this Internship object has a Comapany object
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