package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BrowserTest;
import pages.LoginPage;

@Listeners(listeners.MyListener.class)
public class LoginTest extends BrowserTest{
	
	@Test
	public void loginToApplication() {
		
		LoginPage login = new LoginPage(driver);
		
		login.loginToApp("manasa","BannerHealth@1995");
		
	}
	

}
