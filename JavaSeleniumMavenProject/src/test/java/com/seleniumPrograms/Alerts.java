package com.seleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//simple alert
		driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		
		//confirm alert
		driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
		Alert a2 = driver.switchTo().alert();
		a2.dismiss();
		
		//prompt alert
		driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
		Alert a3 = driver.switchTo().alert();
		a3.sendKeys("this is prompt alert");
		a3.accept();
				
		
	}
	
	
	
}
