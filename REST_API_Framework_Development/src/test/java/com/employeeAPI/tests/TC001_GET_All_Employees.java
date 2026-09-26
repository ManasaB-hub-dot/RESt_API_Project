package com.employeeAPI.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeeAPI.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001_GET_All_Employees extends TestBase {

	// Test Name:Get all employees data

	public class TC001_Get_All_Employees extends TestBase {

		@BeforeClass
		void getAllEmployees() throws InterruptedException {

			logger.info("**********Started TC001_Get_All_Employees **********");

			RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
			httpRequest = RestAssured.given();
			response = httpRequest.request(Method.GET, "/posts");

			Thread.sleep(3);
		}

		@Test
		void checkResponseBody() {
			logger.info("**********  Checking Response Body **********");

			String responseBody = response.getBody().asString();
			logger.info("Response Body==>" + responseBody);
			Assert.assertTrue(responseBody != null);

		}

		@Test
		void checkStatusCode() {
			logger.info("**********  Checking Status Code **********");

			int statusCode = response.getStatusCode(); // Getting status code
			logger.info("Status Code is ==>" + statusCode); // 200
			Assert.assertEquals(statusCode, 200);

		}

		@Test
		void checkResponseTime()
		{
		    logger.info("********** Checking Response Time **********");

		    long responseTime = response.getTime();

		    logger.info("Response Time is ==> " + responseTime);

		    if(responseTime > 5000)
		        logger.warn("Response Time is greater than 5000");
		    
		    System.out.println("Actual Response Time: " + responseTime + " ms");

		    Assert.assertTrue(responseTime < 5000);
		}

		@Test
		void checkstatusline() {
			logger.info("**********  Checking Status Line **********");

			String statusLine = response.getStatusLine(); // Getting status Line
			logger.info("Status Line is ==>" + statusLine);
			Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

		}

		@Test
		void checkContentType()
		{
		    logger.info("********** Checking Content Type **********");

		    String contentType = response.header("Content-Type");
		    logger.info("Content type is ==> " + contentType);

		    Assert.assertEquals(contentType, "application/json; charset=utf-8");
		}

		@Test
		void checkserverType() {
			logger.info("**********  Checking Server Type **********");

			String serverType = response.header("Server");
			logger.info("Server Type is ==> " + serverType);
			Assert.assertEquals(serverType, "cloudflare");

		}

		@Test
		void checkContentEncoding() {
			logger.info("**********  Checking Content Encoding**********");

			String contentEncoding = response.header("Content-Encoding");
			logger.info("Content Encoding is==>" + contentEncoding);
			Assert.assertEquals(contentEncoding, "gzip");

		}

		@Test
		void checkContentLenght()
		{
		    logger.info("********** Checking Content Lenght **********");

		    int contentLength = response.getBody().asString().length();
		    logger.info("Content Length is ==> " + contentLength);

		    if (contentLength < 100)
		        logger.warn("Content Length is less than 100");

		    Assert.assertTrue(contentLength > 100);
		}

		@Test
		void checkCookies() {
			logger.info("**********  Checking Cookies **********");

			String cookie = response.getCookie("PHPSESSID");
			// Assert.assertEquals(cookie,"1esuvsfslcmiee2bfrsgnijtgo");

		}

		@AfterClass
		void tearDown() {
			logger.info("********  Finished TC001_Get_All_Employees ********");
		}

	}
}
