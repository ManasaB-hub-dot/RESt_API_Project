package com.automation.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTable{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("chrome is launched");
		
		driver.manage().window().maximize();
		System.out.println("chrome is maximized");
		Thread.sleep(5);
		
		//Scroll down to static web table
		WebElement staticTable = driver.findElement(By.xpath("//div//*[text()='Static Web Table']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false)", staticTable);
		System.out.println("Scroll down to web table");
		Thread.sleep(5);
		
		//static web table
		List<WebElement> allRows = driver.findElements(By.xpath("//*[text()='Static Web Table']//parent::div//tr"));
		System.out.println("DATA FROM STATIC WEB TABLE");
		for(int i=0;i<allRows.size();i++) {
		WebElement eachRow = allRows.get(i);
		
		List<WebElement> allData = eachRow.findElements(By.tagName("td"));
		for(int j=0 ; j<allData.size();j++) {
			WebElement eachData = allData.get(j);
			System.out.println(eachData.getText());
			
		}
			
		}
		
		//Scroll down to Dynamic web table
		WebElement dynamicTable = driver.findElement(By.xpath("//div//*[text()='Static Web Table']"));
		jse.executeScript("arguments[0].scrollIntoView(false)", dynamicTable);
		System.out.println("Scroll down to web table");
		Thread.sleep(5);
		
		//dynamic web table
		List<WebElement> allrows = driver.findElements(By.xpath("//*[text()='Dynamic Web Table']//parent::div//tr"));
		System.out.println("DATA FROM DYNAMIC WEB TABLE");
		for(int i=allrows.size()-1 ;i<allrows.size();i++) {
		WebElement lastRow = allrows.get(i);
		
		List<WebElement> alldata = lastRow.findElements(By.tagName("td"));
		for(WebElement data : alldata ) {
			System.out.println(data.getText());
			
		}
			
		}
		
		
	}
	
}