package listeners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import utilities.DriverFactory;
import utilities.ScreenshotUtils;

public class TestListener extends TestListenerAdapter {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Listeners executing");
		
		try {
			
			ScreenshotUtils.captureScreenshot(DriverFactory.initDriver(), result.getName());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
