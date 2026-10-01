package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorProgram {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement scroldown = driver.findElement(By.xpath("//button[text()='Point Me']"));
		WebElement scrolUp = driver.findElement(By.xpath("//button[text()='START']"));
		WebElement submit = driver.findElement(By.xpath("//button[text()='login']"));
		WebElement send = driver.findElement(By.id("name"));
		WebElement gett = driver.findElement(By.id("name"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].scrollIntoView(true)",scroldown);
		
		jse.executeScript("arguments[0].scrollIntoView(false)", scrolUp);
		
		jse.executeScript("arguments[0].click()", submit);
		
		jse.executeScript("arguments[0].setAttribute('value','manasa')", send);
		
		Object getText = jse.executeScript("returnarguments[0].get('value')",gett);
		
		String text = (String)getText;
		System.out.println(text);
	}


}
