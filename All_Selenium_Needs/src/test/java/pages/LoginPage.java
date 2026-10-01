package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;


public class LoginPage{
	
	WebDriver driver;
	
	By user = By.id("userName");
	By pass = By.id("password");
	By loginBtn = By.xpath("//button[normalize-space()='Login']");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void loginToApp(String userName, String passWord) {
	
		
		driver.findElement(user).sendKeys(userName);
		driver.findElement(pass).sendKeys(passWord);
		driver.findElement(loginBtn).click();
		
	}
}
