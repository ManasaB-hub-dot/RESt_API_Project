package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class MyTestListener_Using_Super_and_TestListenerAdapter_Test {
	

	@Listeners(listeners.MyTestListener_Using_Super_and_TestListenerAdapter.class)
	public class LoginTest {

	    @Test
	    public void validLogin() {

	        Assert.assertTrue(true);
	    }

	    @Test
	    public void invalidLogin() {

	        Assert.assertTrue(false);
	    }
	}

}
