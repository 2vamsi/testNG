package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 
 * Order in which these annotations will be executed: 
 * 
 * @BeforeSuite
 * @BeforeTest
 * @BeforeClass
 * 
 * @BeforeMethod
 * @Test
 * @AfterMethod
 * 
 * @BeforeMethod
 * @Test - 2nd test
 * @AfterMethod
 * 
 * @BeforeMethod
 * @Test - 3rd test
 * @AfterMethod
 * 
 * @AfterClass
 * @AfterTest
 * PASSED: test1
 * PASSED: test10
 * PASSED: test11
 * 
 * @AfterSuite
 */


public class B_BasicAnnotationsInTestNG {

	@Test
	public void test1() {
		System.out.println("@Test");

	}

	@AfterTest
	public void test2() {
		System.out.println("@AfterTest");
	}
	
	@BeforeTest
	public void test3() {
		System.out.println("@BeforeTest");
	}
	
	@BeforeSuite
	public void test4() {
		System.out.println("@BeforeSuite");
	}
	
	
	@AfterSuite
	public void test5() {
		System.out.println("@AfterSuite");
	}
	
	
	@BeforeClass
	public void test6() {
		System.out.println("@BeforeClass");
	}
	
	
	@AfterClass
	public void test7() {
		System.out.println("@AfterClass");
	}
	
	
	@BeforeMethod
	public void test8() {
		System.out.println("@BeforeMethod");
	}
	
	
	@AfterMethod
	public void test9() {
		System.out.println("@AfterMethod");
	}
	
	
	@Test
	public void test10() {
		System.out.println("@Test - 2nd test");
	}
	
	
	@Test
	public void test11() {
		System.out.println("@Test - 3rd test");
	}
}


