package com.seleniumPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Execution started"+context.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started"+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is successfull"+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test got failed"+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test got skipped"+result.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test got finished"+context.getName());
	}
}
