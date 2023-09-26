package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSuggFlipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("apple i phone");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> AllSugg = driver.findElements(By.xpath("//div[@class='eFQ30H']"));
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
