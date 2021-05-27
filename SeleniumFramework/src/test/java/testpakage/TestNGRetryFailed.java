package testpakage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import listeners.RetryAnalyzer;

public class TestNGRetryFailed {
	
	@Test
	public void testrerun1() {

		System.out.println("i am in test rerun1");
	}
	
	
	@Test(retryAnalyzer= RetryAnalyzer.class)
	public void testrerun2() {

		System.out.println("i am in test rerun2");
		int i = 1/0;
	}
	@Test
	public void testrerun3() {

		System.out.println("i am in test rerun3");
		Assert.assertTrue(false);
	}
	@Test
	public void testrerun4() {

		System.out.println("i am in test rerun4");
	}
}
