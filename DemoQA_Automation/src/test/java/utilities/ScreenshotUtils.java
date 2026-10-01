package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtils {
	
	public static void captureScreenshot(WebDriver driver,String testName ) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\MBUSSA\\OneDrive - Capgemini\\Documents\\TakesScreenshots"+testName+System.currentTimeMillis()+".png");
		
		FileHandler.copy(src, dest);
		
	}

}
