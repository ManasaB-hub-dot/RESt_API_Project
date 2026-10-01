package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ChromeDriverFactory;

public class BrowserTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void chromeDriverSetUp() {
		
		driver=ChromeDriverFactory.startChromeBrowser();
		driver.get("https://demoqa.com/login");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		if(driver!=null) {
			
			driver.quit();
		}
	}
	
	

}
