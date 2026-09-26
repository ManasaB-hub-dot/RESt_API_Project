package com.employeeAPI.utils;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport_Listeners extends TestListenerAdapter {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;

	public void onStart(ITestContext testContext) {
		sparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "/Reports_Extents/REST_API_ExtentReport.html");

		sparkReporter.config().setDocumentTitle("REST API Automation Report");
		sparkReporter.config().setReportName("REST API Testing Report");
		sparkReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Project", "REST_API_Framework_Development");
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());

		test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());

		test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName());

		test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());

		test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
	}

	public void onFinish(ITestContext testContext) {
		extent.flush();
	}
}
