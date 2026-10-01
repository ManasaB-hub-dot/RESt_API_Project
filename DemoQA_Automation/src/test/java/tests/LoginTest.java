package tests;

import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseTest;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void verifyLogin() {
		
		LoginPage login = new LoginPage(driver);
		
		login.loginToApplication("manasa", "BannerHealth@1995");
		
	}
	

}
