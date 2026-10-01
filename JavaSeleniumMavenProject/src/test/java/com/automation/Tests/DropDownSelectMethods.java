package com.automation.Tests;
import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class DropDownSelectMethods{
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://vinothqaacademy.com/drop-down/");
	Thread.sleep(2);
	System.out.println("Browser got launched");
	driver.manage().window().maximize();
	
	Wait<WebDriver> fw = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(AWTException.class);
	fw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='simpleDropdown']")));
	
	Select city = new Select(driver.findElement(By.xpath("//select[@id='simpleDropdown']")));
	Thread.sleep(5);
	city.selectByVisibleText("Singapore");
	System.out.println("signapoor selected");
	
	fw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='banking' and @id='FromAccount']")));
	Select account = new Select(driver.findElement(By.xpath("//select[@name='banking' and @id='FromAccount']")));
	System.out.println("Dynamic Dropdown clicked");
	
	account.selectByValue("Salary");
	System.out.println("Account selected");
	
	Select programmingLanguage = new Select(driver.findElement(By.xpath("//select[@name='programming']")));
	programmingLanguage.selectByIndex(0);
	System.out.println("Programming Language selected");
	Thread.sleep(5);
	driver.close();
	}
}

