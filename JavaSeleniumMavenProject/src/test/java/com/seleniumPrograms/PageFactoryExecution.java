package com.seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageFactoryExecution extends PageFactoryTest {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		PageFactoryTest  pfe = new PageFactoryTest(driver);
		pfe.test("standard_user","secret_sauce");
		driver.close();
	}

}
