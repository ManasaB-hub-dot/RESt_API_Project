package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestListener2_Using_TestListerAdapter extends TestListenerAdapter{
	

	    @Override
	    public void onTestSuccess(ITestResult result) {

	        super.onTestSuccess(result);

	        System.out.println("Test Passed: " + result.getName());

	        System.out.println("Passed tests so far: "
	                + getPassedTests().size());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {

	        super.onTestFailure(result);

	        System.out.println("Test Failed: " + result.getName());

	        System.out.println("Failed tests so far: "
	                + getFailedTests().size());
	    }
	}


