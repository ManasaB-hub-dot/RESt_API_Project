package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import utilities.DriverFactory;
import utilities.ScreenshotUtils;

public class TestListener extends TestListenerAdapter {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			
			System.out.println("Listener Executed");
			
			ScreenshotUtils.capture(DriverFactory.driver, result.getName());
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	

	
}
