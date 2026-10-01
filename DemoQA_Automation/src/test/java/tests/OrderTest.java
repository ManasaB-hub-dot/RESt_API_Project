package tests;

import org.testng.annotations.Test;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import base.BaseTest;

public class OrderTest extends BaseTest{
	
	@Test
	public void order() {
		
		LoginPage login = new LoginPage(driver);
						
		HomePage home = new HomePage(driver);
						
		CartPage page = new CartPage(driver);
		
		login.loginToApplication("manasa", "BannerHealth@1995");
		
		home.searchProduct("Git Pocket Guide");
		
		page.placeOrder();
		
		
		
	}

}
