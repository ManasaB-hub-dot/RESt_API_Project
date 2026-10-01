package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	public static void capture(WebDriver driver, String testName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String path = "C:\\Users\\MBUSSA\\OneDrive - Capgemini\\Documents\\TakesScreenshots\\"+testName+"_"+System.currentTimeMillis()+".png";
		
		File dest = new File(path);
		
		FileUtils.copyFile(src, dest);
		
	}

}
