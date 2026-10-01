package com.automation.Tests;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleLoginProgram{
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(5);
	System.out.println("Browser got launched");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user-name")));
	user.sendKeys("standard_user");
	System.out.println("username entered");
	Thread.sleep(5);
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("secret_sauce");
	System.out.println("password entered");
	Thread.sleep(5);
	WebElement submit = driver.findElement(By.name("login-button"));
	submit.click();
	System.out.println("credentials submitted");
	Thread.sleep(5);
	driver.close();
	System.out.println("driver got closed");
	}
}

