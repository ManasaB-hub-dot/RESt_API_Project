package com.seleniumCode;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_WindowsHandling {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);
		
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("youtube.com");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window :allWindows ) {
			
			if(!window.equals(parentWindow)) {
				
				driver.switchTo().window(window);
				
				System.out.println("child window URL is : "+driver.getCurrentUrl());
				
				driver.close();
			}
			
			System.out.println("parent window URL is : "+driver.getCurrentUrl());
		}
		
		driver.quit();
	}

}
