package listeners;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

public class MyTestListener1_Using_TestListerAdapter extends TestListenerAdapter {

	    @Override
	    public void onFinish(ITestContext context) {

	        System.out.println("Passed Tests: " 
	                + getPassedTests().size());

	        System.out.println("Failed Tests: " 
	                + getFailedTests().size());

	        System.out.println("Skipped Tests: " 
	                + getSkippedTests().size());
	    }
	}
	
	

