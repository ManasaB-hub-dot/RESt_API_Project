package com.seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class D_TestNG_ParellelExecution_Of_Methods {
		
		WebDriver driver ;
		
		@Test(priority=1)
		
		public void test1() {
			
				
			driver = new ChromeDriver();						
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			driver.findElement(By.xpath("//a[text()='Data Entry Form']//parent::h3/following-sibling::div//input[@id='name']")).sendKeys("manasa");
			
			System.out.println("Chrome session finished");
			
			//driver.close();
		}
		
		@Test(priority=-1)
		public void test2() {
			
			driver = new EdgeDriver();						
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			driver.findElement(By.xpath("//a[text()='Data Entry Form']//parent::h3/following-sibling::div//input[@id='name']")).sendKeys("manasa");
			
			System.out.println("edge session finished");
			
			//driver.close();

			
		}
		

	}



