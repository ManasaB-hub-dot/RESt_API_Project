package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver ;
	
	By searchBox = By.xpath("//input[@id='searchBox']");
	By clickSearch = By.xpath("//input[@id='searchBox']/parent::div//button[@type='button']");
	By clickProduct = By.xpath("//a[text()='Git Pocket Guide']");
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void searchProduct(String text) {
		
		driver.findElement(searchBox).sendKeys(text);
		driver.findElement(clickSearch).click();
		driver.findElement(clickProduct).click();
	}

}
