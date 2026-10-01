package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class CartPage {
	
	WebDriver driver;
	
	By clickProduct = By.xpath("//span[@id='see-book-Git Pocket Guide']//a[text()='Git Pocket Guide']");
	By addToCart = By.xpath("//button[text()='Add To Your Collection']");
	
	public CartPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void placeOrder() {
		
		WaitUtils.waitForElement(driver,clickProduct);
		
		driver.findElement(clickProduct).click();
		
		WaitUtils.waitForElement(driver,addToCart);
		
		driver.findElement(addToCart).click();
		
	}
	

}
