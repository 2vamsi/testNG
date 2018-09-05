package com.testNG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * 
 * 
 * we can create dependency between two test methods
 * based on the result of one test method, can can choose to skip the other test method from execution 
 * 
 * we use 'dependsOnMethods' for this 
 * 
 *
 */
public class D_DependsOnMethodInTestNG {

	
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	
	@Test (dependsOnMethods = {"test1"})
	public void test2() {
		System.out.println("Test 2 is Pass");
	}
	
	@Test (dependsOnMethods = {"test1", "test2"})
	public void test3() {
		System.out.println("Test 3 is pass");
	}
	
	
	@Test
	public void test4() {
		Assert.assertTrue(false);
	}
	
	// here Test 5 will be skipped as test 4 is failed
	
	@Test (dependsOnMethods= {"test4"})
	public void test5 () {
		System.out.println("Test 5 will be skipped as test 4 is failed");
	}
	
	
}
