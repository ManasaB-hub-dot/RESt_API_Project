package tests;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;
import pages.OrderPage;

public class OrderTest {
	
	WebDriver driver;
	
	public void orderPlaced() {
		
		LoginPage login = new LoginPage(driver);
		
		HomePage home = new HomePage(driver);
		
		OrderPage order = new OrderPage(driver);
		
		
		
		
	}

}
