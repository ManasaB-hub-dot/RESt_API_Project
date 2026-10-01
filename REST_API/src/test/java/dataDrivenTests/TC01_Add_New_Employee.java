package dataDrivenTests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_Add_New_Employee {
	
	@Test
	public void postNewEmployees() {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		
		//Create a data which needs to be passed into body
		requestParams.put("title", "foo");
		requestParams.put("body", "bar");
		requestParams.put("userId", 1);
		
		//create header which states that the request body is JSON format
		httpRequest.header("Content-Type","application/json");
		
		//Add Json to body of request
		httpRequest.body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST,"/posts");
		
		//Capture response body to perform validation
		String responseBody = response.getBody().asString();
		
		//validate the response body
		Assert.assertTrue(responseBody.contains("foo"));
		Assert.assertTrue(responseBody.contains("bar"));
		Assert.assertTrue(responseBody.contains("1"));
		
		//capture the status code
		int statusCode = response.getStatusCode();
		
		//validate the status code
		Assert.assertEquals(statusCode,201);
		
		
	}

}
