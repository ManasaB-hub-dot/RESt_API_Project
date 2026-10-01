package com.seleniumCode;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WindowsTableProgram_AllRows {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");	
		
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		for(int i=0;i<allRows.size();i++) {
			
			WebElement eachRow = allRows.get(i);
			
			List<WebElement> allData = eachRow.findElements(By.tagName("td"));
			
			for(int j=0;j<allData.size();j++) {
				
				WebElement eachData = allData.get(j);
				
				String text = eachData.getText();
				
				System.out.println(text);
			}					
		
		}
		
		driver.close();
		
	}

}
