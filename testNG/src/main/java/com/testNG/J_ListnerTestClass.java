package com.testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class J_ListnerTestClass {
	int i = 0; 
	
	@Test
	public void test1() {
		//System.out.println("Success test");
	}

	@Test
	public void test2() {
		
		throw new SkipException("I am skipping the test");
	}

	@Test (successPercentage = 60, invocationCount = 5)
	public void test3() {
		i++ ;
		System.out.println("test 3 test method, for invocation count: "+ i);
		
		if(i==1 || i == 2) {
			System.out.println("test3 failed");
			Assert.assertEquals(i, 8);
		}
		
	}
}
