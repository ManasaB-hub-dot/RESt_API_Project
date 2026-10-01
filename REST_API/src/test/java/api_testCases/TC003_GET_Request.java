package api_testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GET_Request {
	
	@Test
	public void getRequestHeaders() {
		
		//Specify base URI
		RestAssured.baseURI = "https://maps.googleapis.com";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET,"/maps/api/place/nearbysearch/xml?location=33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4IgTqSTOmHmJ2HoELb4Jy1s");
		
		//print response in console window
		//using asString(), the response JSON body converts into string format
		String responseBody = response.getBody().asString();
		
		System.out.println("Response body is : "+responseBody);
		
		//capture details of headers from headers
		
		String contentType = response.header("Content-Type");
		
		System.out.println("Content type is : "+contentType);
		
		Assert.assertEquals(contentType, "application/xml; charset=UTF-8");
		
		//capture details of headers from headers
		
		String date = response.header("Date");
				
		System.out.println("date is : "+date);
				
		//Assert.assertEquals(date, "Tue, 22 Sep 2026 14:37:16 GMT");
		
		
	}
}
