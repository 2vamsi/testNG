package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


/***
 * 
 * 
 * We use assertions to pass /fail the scripts based on certain conditions during the execution 
 * 
 * testNG has provided lot of assertions
 * 
 * To write an assertion, we always have to begin with Assert.    - Assert is the class in TestNG
 * Some of the assert methods are: 
 * Assert.assertTrue
 * Assert.assertFalse
 * Assert.assertEquals
 * Assert.assertNotEquals
 * Assert.same
 * Assert.Notsame
 *  etc
 *
 */
public class C_AssertionsInTestNG {

	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		Assert.assertFalse(false);
	}
	
	@Test
	public void test4() {
		Assert.assertFalse(true);
	}
	
	
	
	@Test
	public void test5() {
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test6() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test7() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test8() {
		Assert.assertEquals(false, false);
	}

	
	
	
	@Test
	public void test9() {
		Assert.assertEquals("hello", "hell");
	}

	@Test
	public void test10() {
		Assert.assertNotEquals("actual","actua");
	}

	@Test
	public void test11() {
		Assert.assertNotEquals("actual","actual");
	}

	
	@Test
	public void test12() {
		Assert.assertFalse(true, "False is");
	}
	
	@Test
	public void test13() {
		Assert.assertFalse(false, "This is as expected");
	}
	
	
}
