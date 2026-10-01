package com.automation.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetStringQues {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://javaconceptoftheday.com/java-interview-programs-on-strings/");
		List<WebElement> questionList = driver.findElements(By.xpath("//p//Strong[text()]"));
		
		//List<String> list = new ArrayList<>();
		
		for(WebElement question : questionList) {
			String text = question.getText();
			System.out.println(text);
		}
		
		
		
		
	}

}
