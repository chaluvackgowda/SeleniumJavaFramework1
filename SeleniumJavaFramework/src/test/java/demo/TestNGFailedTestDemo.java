package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFailedTestDemo 
{
	
	@Test
	public void test7()
	{
		System.out.println("inside test7");
	}
	
	@Test
	public void test8()
	{
		System.out.println("inside test8");
		int i=1/0;
	}
	
	@Test()
	public void test9()
	{
		System.out.println("inside test9");
		Assert.assertTrue(0>1);
	}

}
