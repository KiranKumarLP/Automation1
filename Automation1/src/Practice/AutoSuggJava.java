package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggJava {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		List<WebElement> AllSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = AllSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = AllSugg.get(i).getText();
			System.out.println(text);
		}
		//driver.quit();
	}

}
