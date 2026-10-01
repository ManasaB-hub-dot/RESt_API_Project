package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
	
	WebDriver driver;
	
	By addToCart = By.xpath("//div//button[text()='Add To Your Collection']");
	
	public OrderPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void placeOrder() {
		
		driver.findElement(addToCart).click();
	}

}
