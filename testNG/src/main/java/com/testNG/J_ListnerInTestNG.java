package com.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class J_ListnerInTestNG implements ITestListener{

	public void onTestStart(ITestResult arg0) {
	System.out.println("Execution Started for test method: "+getMethodName(arg0));
	Reporter.log("Execution Started for test method: "+getMethodName(arg0));
	}

	public void onTestSuccess(ITestResult arg0) {
		
		System.out.println("Test method:  "+ getMethodName(arg0)+ " is Passed");
		Reporter.log("Test method:  "+ getMethodName(arg0)+ " is Passed");
	} 



	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test method:  "+ getMethodName(arg0)+ " is Failed");
		Reporter.log("Test method:  "+ getMethodName(arg0)+ " is Failed");
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test method:  "+ getMethodName(arg0)+ " is Skipped");
		Reporter.log("Test method:  "+ getMethodName(arg0)+ " is Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("Test method: " +getMethodName(arg0) +  " is failed based on Success Percentage");
		Reporter.log("Test method: " +getMethodName(arg0) +  " is failed based on Success Percentage");
	}

	public void onStart(ITestContext arg0) {
		System.out.println("Execution Started");
		Reporter.log("Test execution Started");
	}

	public void onFinish(ITestContext arg0) {
		System.out.println("Execution Completed");
		Reporter.log("Execution Completed");
	}
	
	
	// this method will give the test method name which is currently being run by test NG
	private static String getMethodName(ITestResult arg0) {
		return arg0.getMethod().getConstructorOrMethod().getName();
		
	}
}
