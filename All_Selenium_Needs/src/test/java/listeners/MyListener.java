package listeners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import utilities.ChromeDriverFactory;
import utilities.ScreenshotUtils;


public class MyListener extends TestListenerAdapter{
	
	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("event listener being executed on test failure");
		
		try {
			
			ScreenshotUtils.takeScreenShot(ChromeDriverFactory.driver, result.getName());
			
		} catch (IOException e) {		
			
			e.printStackTrace();
		}
	}
	

}
