package com.automation.Base;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.automation.Utils.Log;

public class BaseDriver{
	public static void main(String[] args) throws InterruptedException {
	
		
	WebDriver driver  = new ChromeDriver();
	Log.info("Starting the webdriver");
	
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(5);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user-name")));
	user.sendKeys("standard_user");
	
	
	Log.info("username entered");
	
	Thread.sleep(5);
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("secret_sauce");
	
	
	Log.info("password entered");
	
	Thread.sleep(5);
	WebElement submit = driver.findElement(By.name("login-button"));
	submit.click();
	
	
	Log.info("credentials submitted");
	
	Thread.sleep(5);
	driver.close();
	Log.info("credentials submitted");
	}
}

