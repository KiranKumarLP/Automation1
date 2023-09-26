package Practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListBox {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByIndex(27);

		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Oct");

		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("1993");
	}
}
