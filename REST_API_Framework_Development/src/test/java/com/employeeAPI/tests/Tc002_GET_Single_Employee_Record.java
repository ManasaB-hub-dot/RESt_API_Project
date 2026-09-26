package com.employeeAPI.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeeAPI.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Tc002_GET_Single_Employee_Record extends TestBase {

	// Test Name:Get a single employee data

	RequestSpecification httpRequest;
	Response response;

	@BeforeClass
	void getEmployeeData() throws InterruptedException {

		logger.info("*********Started TC002_Get_Single_Employee_Record *********");

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/posts/" + empID);

		Thread.sleep(3);

	}

	@Test
	void checkResposeBody() {

		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody.contains(empID), true);

	}

	@Test
	void checkStatusCode() {

		int statusCode = response.getStatusCode(); // Getting status code
		Assert.assertEquals(statusCode, 200);

	}

	@Test
		void checkResponseTime()
		{
			
			long responseTime = response.getTime();

			System.out.println("Actual Response Time: " + responseTime + " ms");
		
			Assert.assertTrue(responseTime < 5000);

		}

	@Test
	void checkstatusLine() {

		String statusLine = response.getStatusLine(); // Getting status Line
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

	}

	@Test
	void checkContentType() {

		String contentType = response.header("Content-Type");
		Assert.assertEquals(contentType, "application/json; charset=utf-8");

	}

	@Test
	void checkserverType() {

		String serverType = response.header("Server");
		Assert.assertEquals(serverType, "cloudflare");

	}

	@Test
	void checkContentLenght() {
		int contentLength = response.getBody().asString().length();

		Assert.assertTrue(contentLength < 1500);
	}

	@AfterClass
	void tearDown() {

		logger.info("********  Finished TC002_Get_Single_Employee_Record ********");

	}

}
