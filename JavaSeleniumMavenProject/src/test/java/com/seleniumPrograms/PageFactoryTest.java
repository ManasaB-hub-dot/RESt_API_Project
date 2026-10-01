package com.seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryTest {
	
	WebDriver driver;
	
	public PageFactoryTest(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	private WebElement usernameInput;
	
	@FindBy(id="password")
	private WebElement passwordInput;
	
	@FindBy(name="submit")
	private WebElement loginButton;
	
	public void test(String user, String pass) {
		usernameInput.sendKeys(user);
		passwordInput.sendKeys(pass);
		loginButton.click();
			
	}
}
