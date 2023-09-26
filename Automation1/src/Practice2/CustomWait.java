package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		int i=1;
		while(i<=10) {
			try {
				driver.findElement(By.id("logoutLink")).click();
			}
			catch(NoSuchElementException n) {
                     i++;
			}
		}
		System.out.println(i);
		//driver.close();
	}

}
