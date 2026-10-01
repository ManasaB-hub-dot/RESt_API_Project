package com.automation.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement SingleFileUpload = driver.findElement(By.xpath("//input[@id='singleFileInput']//parent::form//parent::div"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false)", SingleFileUpload);
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='singleFileInput']")));
		
		
		driver.findElement(By.xpath("//input[@id='singleFileInput']")).click();
		
//		System.out.println("clicked on choose file");
//		String uploadFile = "Some_sample_Text.txt";
//		chooseFile.sendKeys(uploadFile);

		
	}
}