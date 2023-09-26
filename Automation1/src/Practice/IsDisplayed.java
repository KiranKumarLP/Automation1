package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		WebElement img = driver.findElement(By.xpath("(//i)[1]"));
		boolean res = img.isDisplayed();
		if(res)
			System.out.println("image is displaying");
		else
			System.out.println("image is not displaying");
	}

}
