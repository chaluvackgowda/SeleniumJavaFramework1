package demo;

import org.testng.annotations.Test;

public class TestNGDependencies {

	
	@Test(dependsOnMethods = {"test2"})
	public void test1()
	{
		System.out.println("inside test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("inside test2");
	}

}
