package api_testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC006_Extract_Values_Of_Each_Node {
	
	@Test
	public void printAllValues() {
		
		//Specify base URI
		RestAssured.baseURI = "https://httpbin.org";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET,"/json");
		
		JsonPath jsonPath = response.jsonPath();
		
		System.out.println(jsonPath.getString("slideshow.author"));
		System.out.println(jsonPath.getString("slideshow.date"));
		System.out.println(jsonPath.getString("slideshow.slides.title"));
		System.out.println(jsonPath.getString("slideshow.slides.type"));
		
		
		
		
		
	}

}
