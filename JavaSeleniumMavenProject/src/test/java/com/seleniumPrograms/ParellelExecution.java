package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParellelExecution {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test()
	public void test(String s1) {
		
		if(s1.equals("chrome")) {
			driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.name("login-button")).click();
			
		}
		
		else if(s1.equals("gecko")) {
			driver=new FirefoxDriver();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.name("login-button")).click();
		}
		
		else {
			driver=new InternetExplorerDriver();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.name("login-button")).click();
		}
	}
	
	}


