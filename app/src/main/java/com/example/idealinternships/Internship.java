package com.example.idealinternships; /**
 * This class stores information for a single internship.
 * @author Maxi Attiogbe 
 *
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class Internship {
	//Data
	private Date applicationDeadline;
	private Date startDate;
	private Date endDate;
	private Company company;
	private double cost;
	private ArrayList<Information> additionalInfo;
	
	//Constructor(s)
	/**
	 * Constructs a default Internship object with no application deadline,
	 * start date, end date, company, cost, or additional information
	 */
	public Internship() {
		applicationDeadline = null;
		startDate = null;
		endDate = null;
		company = new Company();
		cost = 0;
		additionalInfo = new ArrayList<Information>();
	}

	/**
	 * Constructs an Internship object with  a given application deadline,
	 * 	start date, end date, company, cost, and additional information
	 * @param applicationDeadline the given application deadline
	 * @param startDate the given start date
	 * @param endDate the given end date
	 * @param company the company hosting the internship
	 * @param cost the cost
	 * @param additionalInfo additional information about the internship for easier sorting and searching
	 */
	public Internship(Date applicationDeadline, Date startDate, Date endDate, Company company, int cost, ArrayList<Information> additionalInfo ) {
		this.applicationDeadline = applicationDeadline;
		this.startDate = startDate;
		this.endDate = endDate;
		this.company = company;
		this.cost = cost;
		this.additionalInfo = additionalInfo;
	}
	//Methods

	/**
	 *
	 * @return
	 */
	public Date getApplicationDeadline() {
		return applicationDeadline;
	}

	/**
	 *
	 * @param applicationDeadline
	 */
	public void setApplicationDeadline(Date applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}

	/**
	 *
	 * @return
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 *
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 *
	 * @return
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 *
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 *
	 * @return
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 *
	 * @param company
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 *
	 * @return
	 */
	public double getCost() {
		return cost;
	}

	/**
	 *
	 * @param cost
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 *
	 * @return
	 */
	public ArrayList<Information> getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 *
	 * @param additionalInfo
	 */
	public void setAdditionalInfo(ArrayList<Information> additionalInfo) {
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