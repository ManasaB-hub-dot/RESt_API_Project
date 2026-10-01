package api_testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC007_API_Validation {
	
	
	@Test
	public void api_Authentication() {
		
		RestAssured.baseURI = "https://httpbin.org/basic-auth/manasa/password";
		
		//Basic authentication // authentication needs to be set first before request object
		PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
		
		auth.setUserName("manasa");
		auth.setPassword("password");
		
		RestAssured.authentication = auth;
		
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET,"");
		
		
		//print response in console window
				//using asString(), the response JSON body converts into string format
		String responseBody = response.getBody().asString();
				
		System.out.println("Response body is : "+responseBody);
		
		//Status code validation
		int statusCode = response.getStatusCode();
				
		System.out.println("Status code is + : "+statusCode);
				
		Assert.assertEquals(statusCode, 200);
		
	}

}
