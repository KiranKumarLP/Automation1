package Practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkertAutoSugg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("oneplus");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='oleBil']"));
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		int count = allLinks.size();
		System.out.println(count);
		for(WebElement text:allLinks) {
			System.out.println(text.getText());
		}
		Thread.sleep(2000);
		allLinks.get(count-1).click();
		
	}

}
