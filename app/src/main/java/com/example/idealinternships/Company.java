package com.example.idealinternships;

/**
 * This class stores a company account for the app Ideal Internships
 * @author baoha_000
 *
 */
public class Company {

	private String name;
	private String bio;
	private String location;
	private String link;
	
	/**
	 * Constructs a company with no name, bio, location, or link 
	 */
	public Company() {
		name = "";
		bio = "";
		location = "";
		link = "";
	}
	
	/**
	 * Constructs a company with a given name and empty bio, location, and link
	 * @param name the compnay's name 
	 */
	public Company(String name) {
		this.name = name;
		bio = "";
		location = "";
		link = "";
	}
	
	/**
	 * Constructs a company with a given name, bio, location, and link 
	 * @param name the company's name 
	 * @param bio the company's bio
	 * @param location the company's location 
	 * @param link the company's link 
	 */
	public Company(String name, String bio, String location, String link) {
		this.name = name;
		this.bio = bio;
		this.location = location;
		this.link = link;
	}

	/**
	 * Returns the company's information 
	 */
	@Override
	public String toString() {
		return "Name: " + name + ", Bio: " + bio + ", Location: " + location + ", Link: " + link;
	}

	/**
	 * Gets the company's name 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the company name to a given name 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the company's bio 
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * Sets the bio to a given bio 
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * Gets the company's location 
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location to a given location 
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets the company's link
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * Sets the link to a given link
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * Compares equality with a company object
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (bio == null) {
			if (other.bio != null)
				return false;
		} else if (!bio.equals(other.bio))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
