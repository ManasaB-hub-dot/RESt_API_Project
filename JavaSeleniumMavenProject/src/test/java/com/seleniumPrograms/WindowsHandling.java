package com.seleniumPrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.name("cart")).click();
		Set<String> allWin = driver.getWindowHandles();
		for(String handle : allWin) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
			
			driver.switchTo().window(parentWindow);
			System.out.println(driver.getCurrentUrl());
			driver.quit();
		}
	}

	
	

}
