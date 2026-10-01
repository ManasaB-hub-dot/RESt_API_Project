package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_CucuDataTable_Scenario_StepDefinition {
	
	WebDriver driver;
	
	public void lauch_browser() {
		
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	public void Enter_FormDetails() {
		
		driver.findElement(By.xpath("//div//input[@id='name']")).sendKeys("manasa"); 
		driver.findElement(By.xpath("//div//input[@id='email']")).sendKeys("manasa@gmail.com");
		driver.findElement(By.xpath("//div//input[@id='phone']")).sendKeys("8000000");
		driver.findElement(By.xpath("//div//p//input[@id='datepicker']")).sendKeys("8000000");
		driver.findElement(By.xpath("//a[@data-date='12']/parent::td[@data-month='7' and @data-year='2026']")).click();
		driver.findElement(By.xpath("//input[@id='txtDate' and @name='SelectedDate']")).click();
		
		
		
	}
	public void submit() {
	
	}
	

}
