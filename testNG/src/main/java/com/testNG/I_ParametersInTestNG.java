package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 *We can supply a parameter from XML to test script using @Parameters annotation
 *
 *Providing default values is mandatory
 *When the parameter is not passed through XML, default value will be taken
 *
 *Also, When you run this test as testNG Test instead of from XML, default values will be taken
 *
 *we also need to use <prameters > tag in testng.xml file to pass the parameters from it to test script
 */

public class I_ParametersInTestNG {

	@Test 
	@Parameters ({"data", "data1"})
	public void test1(@Optional("default") String data, @Optional("default1") String data1) {
		System.out.println(data);
		System.out.println(data1);
		
	}

}
