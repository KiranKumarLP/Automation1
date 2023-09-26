package HandlingPopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWithoutQuit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allWH = driver.getWindowHandles();
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			Thread.sleep(3000);
			driver.close();
		}
	}

}
