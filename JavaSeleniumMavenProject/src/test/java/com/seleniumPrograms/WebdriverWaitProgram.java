package com.seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitProgram {
	
	WebDriver driver= new ChromeDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	
	WebElement f1 =  wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
	
	
	
	
	
}
