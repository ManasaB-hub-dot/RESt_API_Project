package com.seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.Assert;

public class ExtentReportProgram {
	
	private static ExtentSparkReporter sparkReporter;
	private static ExtentReports extentReport ;
	private ExtentTest test;
	private WebDriver driver;

	@BeforeClass
	public void setUpAutomationEnv() {
		
		String reportPath = System.getProperty("user.dir")+"/test-output/ExtentReport.html";
		sparkReporter= new ExtentSparkReporter(reportPath);
		
		sparkReporter.config().setReportName("Web Automation Regression Results");
		sparkReporter.config().setDocumentTitle("Test Execution Report");
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		
		extentReport.setSystemInfo("Operating System", System.getProperty("os.name"));
		extentReport.setSystemInfo("Java Version", System.getProperty("java version"));
		
		driver = new ChromeDriver();
		//driver.manage().window().maximize();		)
	}
	
	@Test
	public void verifyAppTitle() {
		
		test = extentReport.createTest("Verify ApplicationFlow");
		
		test.log(Status.INFO, "Navigating to google home page");
		driver.get("https://google.com");
		
		test.log(Status.INFO, "Extracting page title");
		String text = driver.getTitle();
		
		test.log(Status.WARNING, "gives warning"); 
		
		try {
		Assert.assertEquals(text, "Google");
		test.log(Status.PASS, "Title matches");
		}
		catch(AssertionError e) {
			
			e.printStackTrace();
			test.log(Status.FAIL, "Titles is not matched"+e.getMessage());
			
			
		}
		
	}
	
	@AfterClass
	public void tearDownAutomationEnvironment() {
		
		if(driver!=null) {
			driver.quit();
		}
		
		if(extentReport!=null) {
			extentReport.flush();
		}
		
	}
	
}

//ExtentSparkReporter: Configures the HTML report's look and storage path.
//ExtentReports: Main class to attach reporters and set environment info
//ExtentTest: Logs steps (info, pass, fail) for specific test methods.
//flush(): Writes data to the final HTML file.

