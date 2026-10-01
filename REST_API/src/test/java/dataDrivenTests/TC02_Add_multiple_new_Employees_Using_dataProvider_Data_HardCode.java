package dataDrivenTests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC02_Add_multiple_new_Employees_Using_dataProvider_Data_HardCode {

	@Test(dataProvider = "empdata" )
	public void postNewEmployees(String s1, String s2, String s3) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		
		//Create a data which needs to be passed into body
		requestParams.put("title", s1);
		requestParams.put("body", s2);
		requestParams.put("userId", s3);
		
		//create header which states that the request body is JSON format
		httpRequest.header("Content-Type","application/json");
		
		//Add Json to body of request
		httpRequest.body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST,"/posts");
		
		//Capture response body to perform validation
		String responseBody = response.getBody().asString();
		
		//print response body
		System.out.println(responseBody);
		
		
		//validate the response body
		Assert.assertTrue(responseBody.contains(s1));
		Assert.assertTrue(responseBody.contains(s2));
		Assert.assertTrue(responseBody.contains(s3));
		
		//capture the status code
		int statusCode = response.getStatusCode();
		
		//validate the status code
		Assert.assertEquals(statusCode,201);
		
		
	}

		
		@DataProvider(name="empdata")
		 String[][] getEmpData(){
			
			String empData[][] = {{"Manasa1","Testing","11"},{"Manasa2","Dev","22"},{"Manasa3","DevOps","33"}};
			
			return empData;
		}
	}
	


