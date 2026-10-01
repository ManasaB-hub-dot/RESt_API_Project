package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver ;
	
	By username = By.id("userName");
	By password = By.id("password");
	By loginBtn = By.xpath("//button[text()='Login']");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void loginToWebsite(String user, String pass) {
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}

}

