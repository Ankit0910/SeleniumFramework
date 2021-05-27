package testpakage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGDependenciesDemo {

	@Test(dependsOnMethods = {"test3"})
	public void test1() {

		System.out.println("i am in test1");
	}

	@Test(dependsOnGroups = {"testgroup.*"})
	public void test2() {

		System.out.println("i am in test2");
	}


	@Test(priority = 2)
	public void test3() {

		System.out.println("i am in test3");
	}
	
	@Test(priority = 4)
	public void test4() {

		System.out.println("i am in test4");
	}
	
	@Test
	public void test5() {

		System.out.println("i am in test5");
	}
	
	@Test(groups = {"testgroup"})
	public void test6() {

		System.out.println("i am in test6");
	}
	
	@Test(groups = {"testgroup2"})
	public void test7() {

		System.out.println("i am in test7");
	}
}



