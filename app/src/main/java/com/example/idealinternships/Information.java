package com.example.idealinternships;

/**
 * This class models a single piece of information to be stored by an Internship object.
 * @author Maxi Attiogbe 
 *
 */
public class Information {
	//Data
	private String type;
	private String text;
	
	//Constructor(s)
	/**
	 * Constructs an Information object with an empty String for both the type and text
	 */
	public Information() {
		type = "";
		text = "";
	}
	/**
	 * Constructs and Information object with a given type and text
	 * @param typeOfInfo a String containing the given type of information
	 * @param informationText a String containing the given information text
	 */
	public Information(String typeOfInfo, String informationText) {
		type = typeOfInfo;
		text = informationText;
	}

	//Methods
	/**
	 * Get the type of information
	 * @return the type of information
	 */
	public String getType() {
		return type;
	}
	/**
	 * Set the type of information
	 * @param type the type of information
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * The information text
	 * @return the information text
	 */
	public String getText() {
		return text;
	}
	/**
	 * The information text
	 * @param text the information text
	 */
	public void setInformationText(String text) {
		this.text = text;
	}

	/**
	 * Prints information as a string
	 * @return a String object storing the type and text of information
	 */
	@Override
	public String toString() {
		return type + ": " + text;
	}

	/**
	 * Determins if two information have the same type and text
	 * @param i an Information object to be compared with this one
	 * @return true if the Information object i has the same type and text as this one, false otherwise
	 */
	public boolean equals(Information i) {
		return this.type.equals(i.getType()) && this.text.equals(i.getText());
	}
}