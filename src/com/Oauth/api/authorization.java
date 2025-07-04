package com.Oauth.api;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;

import com.POJOclasses.getCourseDetails;

import POJO_map.Course;
import POJO_map.GetCourse;
import io.restassured.path.json.JsonPath;

public class authorization {

	public static void main(String[] args)

	{
		String Response = given()
				.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj." + "apps.googleusercontent.com")
				.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").formParam("grant_type", "client_credentials")
				.formParams("scope", "trust").when().log().all()
				.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
		System.out.println(Response);

		JsonPath js = new JsonPath(Response);
		String accessToken = js.getString("access_token");
		System.out.println("AccessToken is " + accessToken);

		// GET info using the above Access token
//		
//		String Response2 =
//		given()
//		.queryParam("access_token", accessToken)
//		.when().log().all()
//		.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
//		.asString();
//		System.out.println("Second Response is " +Response2);

		
		
// Get info from Response as JAVA POJO CLASS
		getCourseDetails getcourseResponse = given().queryParam("access_token", accessToken).when().log().all()
				.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(getCourseDetails.class);

		// System.out.println("Second Response is " +getcourseResponse);

		System.out.println("Trainer is" + getcourseResponse.getLinkedIn());
		System.out.println("Expertise name is " + getcourseResponse.getExpertise());

		System.out.println("Course Title is " + getcourseResponse.getCourses().getApi().get(1).getCourseTitle());


		System.out.println("-----------------------------------------------------------------------------------------------------");

		System.out.println("-----------------------------------");
		
		
		GetCourse gcResponse = given().queryParam("access_token", accessToken).when().log().all()
				.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(GetCourse.class);
		
		for (Map.Entry<String, List<Course>> entry : gcResponse.getCourses().entrySet()) {
			String category = entry.getKey();
			
			List<Course> courseList = entry.getValue();

			System.out.println("Category: " + category);
			
			for (Course course : courseList) {
				System.out.println("    Title: " + course.getCourseTitle());
				System.out.println("    Price: " + course.getPrice());
			}
			
			
			System.out.println("-----------------------------------");
		}

		// Print price corresponding to Appium
		for (Map.Entry<String, List<Course>> entry : gcResponse.getCourses().entrySet()) {
			List<Course> courseList = entry.getValue();
			
			for (Course course : courseList) 
			{
				if (course.getCourseTitle().contains("Appium")) 
				{
					System.out.println("    Price for Appium: " + course.getPrice());
				}
			}
		}
		

		//Print the data from RESPONSE
		
		System.out.println(gcResponse.getLinkedIn());
		
		

	}

}
