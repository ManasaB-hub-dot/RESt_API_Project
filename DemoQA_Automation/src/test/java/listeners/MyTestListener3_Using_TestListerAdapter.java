package listeners;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class MyTestListener3_Using_TestListerAdapter extends TestListenerAdapter {



	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test Started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        super.onTestSuccess(result);

	        System.out.println("Test Passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        super.onTestFailure(result);

	        System.out.println("Test Failed: " + result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        super.onTestSkipped(result);

	        System.out.println("Test Skipped: " + result.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {

	        System.out.println("===== FINAL TEST RESULTS =====");

	        System.out.println("Passed Tests: "
	                + getPassedTests().size());

	        System.out.println("Failed Tests: "
	                + getFailedTests().size());

	        System.out.println("Skipped Tests: "
	                + getSkippedTests().size());
	    }
	}


