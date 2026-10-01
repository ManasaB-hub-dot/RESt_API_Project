package tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listeners.MyTestListener3_Using_TestListerAdapter.class)
public class MyTestListener3_Using_TestListerAdapter_Test {


	    @Test
	    public void validLogin() {

	        Assert.assertTrue(true);
	    }

	    @Test
	    public void invalidLogin() {

	        Assert.assertTrue(false);
	    }

	    @Test
	    public void paymentTest() {

	        throw new SkipException("Skipping this test");
	    }
	}

