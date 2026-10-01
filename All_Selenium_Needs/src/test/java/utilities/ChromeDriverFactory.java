package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory {
	
	public static WebDriver driver;
	
	public static WebDriver startChromeBrowser() {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
				
		return driver;
	}

}
