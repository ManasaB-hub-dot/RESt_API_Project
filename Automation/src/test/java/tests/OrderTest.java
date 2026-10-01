package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

@Listeners(listeners.TestListener.class)
public class OrderTest extends BaseTest {

	@Test
	public void verifyOrder() {
		
		LoginPage login = new LoginPage(driver);
		
		HomePage home = new HomePage(driver);
		
		CartPage cart = new CartPage(driver);
		
		login.loginToWebsite("manasa","BannerHealth@1995");
		home.searchProduct("Git Pocket Guide");
		cart.placeOrder();
	
	}
}
