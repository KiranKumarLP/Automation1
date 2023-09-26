package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion1 {
	@Test
	public void veifyTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String aTitle = driver.getTitle();
		String eTitle = "doogle";
		if(aTitle.equals(eTitle))//if else block will not have capacity to fail the test script
			Reporter.log("title is Matching and passes",true);
		else
			Reporter.log("title is Not Matching and failed",true);
		driver.quit();
	}
}

