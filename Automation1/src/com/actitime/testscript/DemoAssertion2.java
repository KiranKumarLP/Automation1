package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion2 {
	@Test
	public void verifytitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String aTitle = driver.getTitle();
		String eTitle = "Google";
		Assert.assertEquals(aTitle,eTitle);
		driver.quit();
	}

}
