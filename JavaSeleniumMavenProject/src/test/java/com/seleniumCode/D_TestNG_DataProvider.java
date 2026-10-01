package com.seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D_TestNG_DataProvider {
	
	
	@Test(dataProvider="Login")
	public void test(String s1, String s2) {
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("user-name")).sendKeys(s1);
	
	driver.findElement(By.id("password")).sendKeys(s2);
	
	driver.findElement(By.name("login-button")).click();
	
	}
	
	@DataProvider(name="Login")
	public Object[][] data(){
		
		return new Object[][] {{"manasa","12345"},{"Manasa","23455"},{"maina","2222"},{"standard_user","secret_sauce"}};
	}

}
