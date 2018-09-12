package com.testNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class K_RetryTest {
	int i =0;
	@Test (alwaysRun = true)
	public void test1() {
		
		i++;
		if (i<5) {
			System.out.println("test Failed");
	
			Assert.assertTrue(false);
		
		}
		else  {
			Assert.assertTrue(true);
			System.out.println("test passed");
		}
	}
}
