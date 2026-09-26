package com.employeeAPI.tests;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeeAPI.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC003_POST_Employee_Record extends TestBase {
	

	    String title = "API Testing with Rest Assured";
	    String body = "This is a sample post created using Rest Assured";
	    String userId = "1";


	    @BeforeClass
	    void createEmployee() throws InterruptedException
	    {
	        logger.info("*********Started TC003_Post_Employee_Record *********");

	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	        httpRequest = RestAssured.given();

	        JSONObject requestParams = new JSONObject();

	        requestParams.put("title", title);
	        requestParams.put("body", body);
	        requestParams.put("userId", userId);

	        // Add a header stating the Request body is a JSON
	        httpRequest.header("Content-Type", "application/json");

	        // Add the JSON to the body of the request
	        httpRequest.body(requestParams.toJSONString());

	        response = httpRequest.request(Method.POST, "/posts");

	        Thread.sleep(5000);
	    }


	    @Test
	    void checkResposeBody()
	    {
	        String responseBody = response.getBody().asString();

	        logger.info("Response Body ==> " + responseBody);

	        Assert.assertTrue(responseBody.contains(title));
	        Assert.assertTrue(responseBody.contains(body));
	        Assert.assertTrue(responseBody.contains(userId));
	    }


	    @Test
	    void checkStatusCode()
	    {
	        int statusCode = response.getStatusCode();

	        logger.info("Status Code ==> " + statusCode);

	        Assert.assertEquals(statusCode, 201);
	    }


	    @Test
	    void checkstatusLine()
	    {
	        String statusLine = response.getStatusLine();

	        logger.info("Status Line ==> " + statusLine);

	        Assert.assertTrue(statusLine.contains("201"));
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
	        logger.info("******** Finished TC003_Post_Employee_Record ********");
	    }
	}

