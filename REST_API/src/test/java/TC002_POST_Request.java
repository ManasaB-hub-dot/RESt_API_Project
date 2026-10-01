import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {


	@Test
	public void postWeatherDetails() {
		
		//Specify base URI
		RestAssured.baseURI = "https://dummyjson.com/products";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		JSONObject  requestParams = new JSONObject();
		
		//Request payload
		requestParams.put("title", "REST Assured Practice Product");
		requestParams.put("price", 199);
		requestParams.put("category", "testing");
		
		
		httpRequest.header("Content Type","application/json");
		
		httpRequest.body(requestParams.toJSONString());// attach data to the request
		
		//Response object
		Response response = httpRequest.request(Method.POST,"/add");
		
		//print response in console window
		//using asString(), the response JSON body converts into string format
		String responseBody = response.getBody().asString();
		
		System.out.println("Response body is : "+responseBody);
		
		//Status code validation
		int statusCode = response.getStatusCode();
		
		System.out.println("Status code is + : "+statusCode);
		
		Assert.assertEquals(statusCode, 201);
		
		//Success response validation
		String successResponse = response.getStatusLine();
		
		System.out.println("Success response is + : "+successResponse);
		
		//Assertion
		Assert.assertEquals(successResponse, "HTTP/1.1 201 Created");
		
		
		
	}
	
}
