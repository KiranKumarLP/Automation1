package com.actitime.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethod {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://demo.actitime.com/login.do");
    LoginPage l = new LoginPage(driver);
    l.setLogin("admin","manager");
    LogoutPage lp = new LogoutPage(driver);
    lp.setLogout();
  }
}
