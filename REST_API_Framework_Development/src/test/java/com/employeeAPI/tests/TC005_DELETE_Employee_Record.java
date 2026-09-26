package com.employeeAPI.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeeAPI.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC005_DELETE_Employee_Record extends TestBase{
	

	    @BeforeClass
	    void deleteEmployee() throws InterruptedException
	    {
	        logger.info("*********Started TC005_Delete_Employee_Record *********");

	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	        httpRequest = RestAssured.given();

	        response = httpRequest.request(Method.DELETE, "/posts/1");

	        Thread.sleep(3000);
	    }


	    @Test
	    void checkResposeBody()
	    {
	        String responseBody = response.getBody().asString();

	        logger.info("Response Body ==> " + responseBody);

	        Assert.assertNotNull(responseBody);
	    }


	    @Test
	    void checkStatusCode()
	    {
	        int statusCode = response.getStatusCode();

	        logger.info("Status Code ==> " + statusCode);

	        Assert.assertEquals(statusCode, 200);
	    }


	    @Test
	    void checkstatusLine()
	    {
	        String statusLine = response.getStatusLine();

	        logger.info("Status Line ==> " + statusLine);

	        Assert.assertTrue(statusLine.contains("200"));
	    }


	    @Test
	    void checkContentType()
	    {
	        String contentType = response.header("Content-Type");

	        logger.info("Content Type ==> " + contentType);

	        Assert.assertTrue(contentType.contains("application/json"));
	    }


	    @Test
	    void checkserverType()
	    {
	        String serverType = response.header("Server");

	        logger.info("Server Type ==> " + serverType);

	        Assert.assertNotNull(serverType);
	    }


	    @Test
	    void checkcontentEncoding()
	    {
	        String contentEncoding = response.header("Content-Encoding");

	        logger.info("Content Encoding ==> " + contentEncoding);

	        if (contentEncoding != null)
	        {
	            Assert.assertFalse(contentEncoding.isEmpty());
	        }
	    }


	    @AfterClass
	    void tearDown()
	    {
	        logger.info("******** Finished TC005_Delete_Employee_Record ********");
	    }

	}

