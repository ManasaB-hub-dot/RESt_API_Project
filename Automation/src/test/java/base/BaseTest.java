package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.DriverFactory;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		driver=DriverFactory.initDriver();
		
		driver.get("https://demoqa.com/login");
	}
	
	@AfterMethod
	public void tearDown() {
		
		if(driver!=null) {
			
			driver.quit();
		}
	}


}