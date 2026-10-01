package com.automation.Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Browser got launched");
		
		driver.manage().window().maximize();
		System.out.println("Browser got maximized");
		
		Thread.sleep(5);
		
		WebElement simpleAlert = driver.findElement(By.xpath("//h2[text()='Alerts & Popups']//parent::div//div//button[text()='Simple Alert']"));
		simpleAlert.click();
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(5);
		System.out.println("simple alert got accepted");
		
		WebElement confirmAlrt = driver.findElement(By.xpath("//h2[text()='Alerts & Popups']//parent::div//div//button[text()='Simple Alert']"));
		confirmAlrt.click();		
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(5);
		a2.dismiss();
		System.out.println("confirm alert got dismissed");
		
		WebElement promptAlert = driver.findElement(By.xpath("//h2[text()='Alerts & Popups']//parent::div//div//button[text()='Prompt Alert']"));
		promptAlert.click();		
		Alert a3 = driver.switchTo().alert();
		a3.sendKeys("manasa@suresh");
		Thread.sleep(5);
		System.out.println("prompt alert sent information");
		
		driver.close();
		}
	}

		
