package com.seleniumCode;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListerProgram implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Starting the test"+context.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Starting the test"+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Starting the test"+result.getName());
	}
	
	
}
