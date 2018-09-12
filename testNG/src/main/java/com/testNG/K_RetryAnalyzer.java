package com.testNG;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class K_RetryAnalyzer implements IRetryAnalyzer {

	int counter = 0;
	int retrylimit = 10;
	
	/* Sometimes,  test may fail because of -  browser crash or server down/ database connectivity issue etc
	 * We want to re-trigger the test to make sure that it is a valid failure
	 * 
	 * We can handle this programmatically 
	 */
	
	
	/* For this, we implement testNG interface called  IRetryAnalyzer which has a method called retry
	 * as part of the implementation for this method, we can define the maximum limit for retry attempts
	 * 
	 */
	
	 
	/* this method decides how many times  a test needs to be run.
	 * TestNG will call this method every time a test fails. 
	 * so we can put some code in here to decide, when to rerun the test. 
	 * 
	 * Note: This method will return true if a test needs to be retried
	 * and false if not.
	 * ------------------------------------------------------------------------------------------------
	*/
	
	
	/* apart from this, we have another interface called IAnnotationTransformer 
	 * it has a method called transform which takes some arguments
	 * 
	 * and annotation has setRetryAnalyzer which will take retrylistner as argument
	 * 
	 * 
	*/
	
	/* Usage: 
	 * 
	 * we mention RetryListener in the testng.xml 
	 * this listener will invoke retryAnalyzer class. 
	 * 
	 * Retry Analyzer class will have the number of retries defined in it
	 * 
	 * When a test class is executed from testng.xml, when failures happen - 
	 * Retry analyzer with help of retryListener will retry executing the test - that many number of times
	 * 
	 * 
	 */
	
	

	
	public boolean retry(ITestResult result) {
		if (counter < retrylimit)
		{
			System.out.println("Retrying for counter: "+counter);
			counter ++ ;
			return true;
		}
		return false;
	}
	
}
