package api_testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
	@Test
	public void getWeatherDetails() {
		
		//Specify base URI
		RestAssured.baseURI = "https://dummyjson.com/products";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET,"/1");
		
		//print response in console window
		//using asString(), the response JSON body converts into string format
		String responseBody = response.getBody().asString();
		
		System.out.println("Response body is : "+responseBody);
		
		//Status code validation
		int statusCode = response.getStatusCode();
		
		System.out.println("Status code is + : "+statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		
		String statusLine = response.getStatusLine();
		
		System.out.println("Status Line is + : "+statusLine);
		
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");	
		
		
	}

}
