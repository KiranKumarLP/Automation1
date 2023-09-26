package HandlingTabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.get("https://demo.actitime.com/login.do");
       driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
       Set<String> allWH = driver.getWindowHandles();
       int count = allWH.size();
       System.out.println(count);
       for(String wh:allWH)
    	   System.out.println(wh);
       driver.quit();
	}

}
