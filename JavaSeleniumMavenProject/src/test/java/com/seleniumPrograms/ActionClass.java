package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//moveToElement
		
		WebElement moveToEle = driver.findElement(By.xpath("//button[text()='Point Me']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(moveToEle).perform();
		
		//contextClick
		WebElement rightClick = driver.findElement(By.xpath("//input[@value='Hello World!']"));
		Actions a2 = new Actions(driver);
		a2.contextClick(rightClick).perform();
		
		WebElement drag = driver.findElement(By.xpath("//div//p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.xpath("//div//p[text()='Drop here']"));
		Actions a3 = new Actions(driver);
		a3.dragAndDrop(drag, drop).perform();
		
		
		
	}	
		

}
