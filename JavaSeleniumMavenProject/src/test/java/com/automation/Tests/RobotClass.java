package com.automation.Tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotClass{
	
	public By countryField = By.xpath("//div//label[text()='Country:']");
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("chrome is launched");
		
		driver.manage().window().maximize();
		System.out.println("chrome is maximized");
		Thread.sleep(5);
		
		//Scroll down to country
		WebElement country = driver.findElement(By.xpath("//div//label[text()='Country:']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false)", country);
		System.out.println("Scroll down to country");
		Thread.sleep(5);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Country:']//parent::div//child::option[@value='usa']")));
		driver.findElement(By.xpath("//label[text()='Country:']//parent::div//child::option[@value='usa']"));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_3);
		WebElement text = driver.findElement(By.xpath("//label[text()='Country:']//parent::div//child::option[@value='germany']"));
		System.out.println(text.getText());
		driver.quit();
		
	}
}