package com.seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_WindowsTableProgram_EvenRows_In_Last_4_Rows {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		for(int i=allRows.size()-4;i<allRows.size();i++) {
			
			if(i%2==0) {
			
			WebElement eachRow = allRows.get(i);
			
			List<WebElement> allData = eachRow.findElements(By.tagName("td"));
			
			for(int j=0;j<allData.size();j++) {
				
				WebElement eachdata = allData.get(j);
				
				String text = eachdata.getText();
				
				System.out.println(text);
			}
			
			}
			
		}
		
	}

}
