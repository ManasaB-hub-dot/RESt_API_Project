package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class HomePage {
	
	WebDriver driver;
	
	By searchBox = By.xpath("//input[@id='searchBox']");
	By searchButton = By.xpath("//input[@id='searchBox']/parent::div//button[@type='button']");
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void searchProduct(String product) {
		
		WaitUtils.waitForElement(driver, searchBox);
		
		driver.findElement(searchBox).sendKeys(product);
		driver.findElement(searchButton).click();
	}

}
