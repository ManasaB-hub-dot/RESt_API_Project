package com.automation.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAndDeselectMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Browser got launched");

		driver.manage().window().maximize();
		System.out.println("Browser got maximized");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement scrolldown = driver.findElement(By.xpath("//div//label[text()='Days:']"));
		jse.executeScript("arguments[0].scrollIntoView(false)", scrolldown);
		System.out.println("scroll down a bot");

		Thread.sleep(5);
		WebElement sunday = driver
				.findElement(By.xpath("//label[text()='Days:']//parent::div//div//input[@id='sunday']"));

		if (!sunday.isSelected()) {
			sunday.click();
			System.out.println("Sunday checkbox got selected");

		}
		// to safely deselect a single check box
		if (sunday.isSelected()) {
			sunday.click();
		}
		Thread.sleep(5);
		System.out.println("Sunday checkbox got deselected");
		driver.close();
	}
}