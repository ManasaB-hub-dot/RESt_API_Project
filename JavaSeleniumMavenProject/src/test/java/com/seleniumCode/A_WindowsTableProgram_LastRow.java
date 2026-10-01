package com.seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WindowsTableProgram_LastRow {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
			
			WebElement lastRow = allRows.get(allRows.size()-1);
			
			List<WebElement> allData = lastRow.findElements(By.tagName("td"));
			
			for(int i=0;i<allData.size();i++) {
				
				WebElement eachData = allData.get(i);
				
				String text = eachData.getText();
				
				System.out.println(text);
			}
		}
		
		
	}


