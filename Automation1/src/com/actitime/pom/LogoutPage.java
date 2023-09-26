package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	private WebElement logout;
	
	public LogoutPage(WebDriver driver) {
		logout = driver.findElement(By.id("logoutLink"));
	}
	
	public void setLogout() {
		logout.click();	
	}
}
