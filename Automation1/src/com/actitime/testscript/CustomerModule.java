package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule {

	@Test(invocationCount=0)
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	
	@Test
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
		
	}
}
