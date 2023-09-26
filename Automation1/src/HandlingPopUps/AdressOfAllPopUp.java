package HandlingPopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdressOfAllPopUp {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.get("https://secure.indeed.com/auth");
       driver.findElement(By.id("login-google-button")).click();
       driver.findElement(By.id("apple-signin-button")).click();
       Set<String> allWH = driver.getWindowHandles();
       for(String wh:allWH)
       {
    	   System.out.println(wh);
       }
       driver.quit();
	}

}
