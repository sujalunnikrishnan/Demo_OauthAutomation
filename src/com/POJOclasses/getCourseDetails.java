package com.POJOclasses;

public class getCourseDetails

{

	// Deserialization : convert JSON response into JAVA

	private String instructor, url, services, expertise, linkedIn; // Declaring of variables for all props in JSON
																	// response
	private coursesClass Courses;

	// To Convert - Select all declared variables and > Alt+shift+S > Generate
	// Getter Setter

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public coursesClass getCourses() {
		return Courses;
	}

	public void setCourses(coursesClass courses) {
		this.Courses = courses;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

}
