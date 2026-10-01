package com.automation.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.automation.Utils.Log;

public class ActionsClass{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Log.info("Browser got launched");
		
		driver.manage().window().maximize();
		System.out.println("Browser got launched");
		
		Thread.sleep(5);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement mouseHover = driver.findElement(By.xpath("//div[@id='HTML3']//div//div//button[text()='Point Me']"));
		jse.executeScript("arguments[0].scrollIntoView(false)", mouseHover);
		
		Log.info("Browser got launched");
		
		System.out.println("scroll down a bit");
		Thread.sleep(5);
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(mouseHover).perform();
		
		Log.info("Browser got launched");
		
		System.out.println("moveToElement is Done");
		Thread.sleep(5);
		
		Actions a2 = new Actions(driver);
		WebElement contextClick = driver.findElement(By.xpath("//div[@id='HTML10']//div//button[text()='Copy Text']"));
		a2.contextClick(contextClick).perform();
		
		Log.info("Browser got launched");
		
		System.out.println("contextClick is Done");
		Thread.sleep(5);
		
		
		Actions a3 = new Actions(driver);
		WebElement doubleclick = driver.findElement(By.xpath("//div[@id='HTML10']//div//button[text()='Copy Text']"));
		a3.doubleClick(doubleclick).perform();
		
		Log.info("Browser got launched");
		
		System.out.println("doubleClick is Done");
		Thread.sleep(5);
		

		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']//*[text()='Drag me to my target']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']//*[text()='Drop here']"));
		
		jse.executeScript("arguments[0].scrollIntoView(false)", source);
		
		Log.info("Browser got launched");
		
		System.out.println("scroll down a bit");
		Thread.sleep(3);
		
		Actions a4 = new Actions(driver);
		a4.dragAndDrop(source, destination).perform();
		
		Log.info("Browser got launched");
		
		System.out.println("dragAndDrop is Done");
		Thread.sleep(5);
		
		WebElement field = driver.findElement(By.xpath("//div[@id='HTML10']//div//input[@id='field2']"));
		Actions a5 = new Actions(driver);
		a5.keyDown(field,Keys.SHIFT).sendKeys("MANASA",Keys.SHIFT).keyUp(field,Keys.SHIFT).perform();
		
		Log.info("Browser got launched");
		
		System.out.println("keyUPAndkeyDown is Done");
		Thread.sleep(5);		
		
		Log.info("Browser got launched");
		
		System.out.println("window is getting closed");
		driver.close();
		
		
		
	}
}