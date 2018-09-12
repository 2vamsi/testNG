package com.testNG;

import org.testng.annotations.Test;

public class G_GroupingInTestNG {

	@Test (groups= {"sanity"})
	public void test1() {
		System.out.println("Running Sanity suite");
	}
	
	
	@Test (groups = {"sanity", "regression"})
	public void test2() {
		System.out.println("Running &  Sanity suites");
	}
	
	
	@Test (groups = {"regression"})
	public void test3() {
		System.out.println("Running Regression suite");
		System.out.println(System.getProperty("url"));
		System.out.println("Password is: " +System.getProperty("password"));
	}
}
