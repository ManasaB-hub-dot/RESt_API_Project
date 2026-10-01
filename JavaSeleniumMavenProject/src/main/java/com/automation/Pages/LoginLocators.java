package com.automation.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginLocators{
	
	WebDriver driver;
	
	public LoginLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	private WebElement usernameInput;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordInput ;
	
	@FindBy(xpath ="//input[@name='login-button']")
	private WebElement loginInput ;
	
	public void test(String s1, String s2) {
		usernameInput.sendKeys(s1);
		
		passwordInput.sendKeys(s2);
		
		loginInput.click();
	}
	
}