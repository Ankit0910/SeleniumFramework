package testpakage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)

@Test(groups = {"AlltestClass"})
public class TestNGGroupingDemo {

	@Test(groups = {"sanity"})
	public void test21() {

		System.out.println("i am in test 21");
		throw new SkipException("This test is delebratly skipped");
	}

	@Test(groups = {"sanity", "smoke"})
	public void test22() {

		System.out.println("i am in test 22");
		AssertJUnit.assertTrue(false);
	}

	@Test(groups = {"windows.regression"})
	public void test23() {

		System.out.println("i am in test 23");
	}

	@Test
	public void test24() {

		System.out.println("i am in test 24");
	}

}
