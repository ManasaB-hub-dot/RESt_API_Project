package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtils {
	
	public static WebDriver driver;
	
	public static void takeScreenShot(WebDriver driver, String testName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String path = "C:\\Users\\MBUSSA\\OneDrive - Capgemini\\Documents\\TakesScreenshots\\DemoQA"+testName+"_"+System.currentTimeMillis()+".png";
		
		File dest = new File(path);
		
		FileHandler.copy(src, dest);
	}

}
