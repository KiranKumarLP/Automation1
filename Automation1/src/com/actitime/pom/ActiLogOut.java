package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLogOut {
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public ActiLogOut(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setLogout() {
		logout.click();
	}

}
