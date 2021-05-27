package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {

	@Test(priority = 1)
	public void test1() {

		System.out.println("i am in test 1");
		throw new SkipException("This test is delebratly skipped");
	}

	@Test(priority = 3)
	public void test2() {

		System.out.println("i am in test 2");
		AssertJUnit.assertTrue(false);
	}

	@Test(priority = 4)
	public void test3() {

		System.out.println("i am in test 3");
	}

	@Test(priority = 2)
	public void test4() {

		System.out.println("i am in test 4");
	}

}
