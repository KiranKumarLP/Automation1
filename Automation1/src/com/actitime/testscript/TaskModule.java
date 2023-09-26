package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass{
	
	@Test(groups="smokeTesting")
	public void createTask() {
		Reporter.log("createTask",true);
	}
	
	@Test(groups= {"regressionTesting"})
	public void modifyCustomer() {
		Reporter.log("modifyTask",true);
	}
	
	@Test(groups= {"regressionTesting"})
	public void deleteCustomer() {
		Reporter.log("deleteTask",true);
	}

}
