package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMainMehod {

	@Test
	public void validLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        ActiLoginPage l = new ActiLoginPage(driver);
        l.setLogin("admin1","manager1");
        Thread.sleep(5000);
        l.setLogin("admin", "manager");
        ActiLogOut al = new ActiLogOut(driver);
        Thread.sleep(2000);
        al.setLogout();
	}

}
