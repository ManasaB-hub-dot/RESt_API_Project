package listeners;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestListener_Using_Super_and_TestListenerAdapter extends TestListenerAdapter{
	
	
	//You do not need to write super.onTestFailure(result) or super.onTestSuccess(result) all the time.
	//Use it when you want the parent class (TestListenerAdapter) implementation also to execute, especially if you're relying on functionality maintained by that parent implementation.
	

	    @Override
	    public void onTestSuccess(ITestResult result) {

	        // Call parent class method
	        super.onTestSuccess(result);

	        System.out.println("PASS: " + result.getName());

	        System.out.println("Passed count: "
	                + getPassedTests().size());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {

	        // Call parent class method
	        super.onTestFailure(result);

	        System.out.println("FAIL: " + result.getName());

	        System.out.println("Failed count: "
	                + getFailedTests().size());
	    }

	    @Override
	    public void onFinish(ITestContext context) {

	        System.out.println("===== FINAL RESULT =====");

	        System.out.println("Total Passed: "
	                + getPassedTests().size());

	        System.out.println("Total Failed: "
	                + getFailedTests().size());
	    }
	}


