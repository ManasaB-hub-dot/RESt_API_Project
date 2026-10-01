package com.automation.Tests;

import com.automation.Pages.*;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class LoginTest{
	
public LoginLocators LoginLocators;
	
public static void main(String[] args) throws InterruptedException{
	
	//System.setProperty("webdriver.chrome.driver", "C://Java-Selenium//Driver//chrome-win64//chrome.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(5);
	
		try {
			
		driver.get("https://www.saucedemo.com/");
		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		fw.until(ExpectedConditions.titleContains("https://www.saucedemo.com/"));
	
	
		LoginLocators loc = new LoginLocators(driver);
		
		Thread.sleep(3);
		
		loc.test("admin", "admin123");
		
	
		
		fw.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
	
		Thread.sleep(3);
		
		
		System.out.println("Successfully loggedin");
		
		}
		catch(Exception e) {
			
			System.err.println("Exception occured");
			e.getStackTrace();
		}
		
		finally {
			Thread.sleep(3);
			driver.quit();
		}
	}
	
}