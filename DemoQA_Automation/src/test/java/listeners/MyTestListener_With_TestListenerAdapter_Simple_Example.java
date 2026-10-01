package listeners;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestListener_With_TestListenerAdapter_Simple_Example extends TestListenerAdapter{

	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println("Test execution started");
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test Started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test Passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test Failed: " + result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test Skipped: " + result.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("Test execution finished");
	    }
	}
	

