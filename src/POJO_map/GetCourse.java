package POJO_map;

import java.util.List;
import java.util.Map;

public class GetCourse

{

	// Deserialization : convert JSON response into JAVA

	private String instructor, url, services, expertise, linkedIn; // Declaring of variables for all props in JSON
																	// response
	private Map<String, List<Course>> courses;

	// To Convert - Select all declared variables and > Alt+shift+S > Generate
	// Getter Setter

	public Map<String, List<Course>> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, List<Course>> courses) {
		this.courses = courses;
	}

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

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

}
