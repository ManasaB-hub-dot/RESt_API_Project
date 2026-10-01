package com.seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class D_TestNG_ParellelExecution_Of_Tests {
	
	WebDriver driver ;
	
	@Parameters("browser")
	@Test()
	
	public void test(@Optional("edge") String s1) {
		
		
		
		if(s1.equals("chrome")) {
			
			driver = new ChromeDriver();						
			
		}
		
		else if(s1.equals("ie")) {
			
			driver= new InternetExplorerDriver();

		}
		
		else {
			
			driver = new EdgeDriver();
			
			
		}
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//a[text()='Data Entry Form']//parent::h3/following-sibling::div//input[@id='name']")).sendKeys("manasa");
		
		driver.close();
	}
	

}
