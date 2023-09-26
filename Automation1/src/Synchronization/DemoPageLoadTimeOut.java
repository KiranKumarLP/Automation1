package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPageLoadTimeOut {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
       try {
    	   driver.get("https://demo.actitime.com/login.do");
    	   System.out.println("Page loaded with in 5 second and PASS");
       }
       catch(Exception e) {
    	   System.out.println("Page not loaded with in 5 seconds and Failed");
       }
       driver.quit();
	}

}
