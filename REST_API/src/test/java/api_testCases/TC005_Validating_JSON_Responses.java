package api_testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_Validating_JSON_Responses {
	
	@Test
	public void printAllHeaders() {
		
		//Specify base URI
		RestAssured.baseURI = "https://httpbin.org";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET,"/json");
		
		//print response in console window
		//using asString(), the response JSON body converts into string format
		String responseBody = response.getBody().asString();
		
		System.out.println("Response body is : "+responseBody);
		
		Assert.assertTrue(responseBody.contains("slideshow"));
		
		
		
	}

}
