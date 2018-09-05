package com.testNG;

import org.testng.annotations.Test;

public class G_GroupingInTestNG {

	@Test (groups= {"sanity"})
	public void test1() {
		
		
	}
	
	@Test (groups = {"sanity", "regression"})
	public void test2() {
		
		
	}
	
	@Test (groups = {"regression"})
	public void test3() {
		
		
	}
}
