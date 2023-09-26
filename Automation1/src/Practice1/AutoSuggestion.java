package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		Thread.sleep(2500);
		List<WebElement> AllSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = AllSugg.size();
		System.out.println(count);
		
		for(WebElement text:AllSugg) {
			System.out.println(text.getText());
		}
		
		System.out.println("------------------------");
		
		for(int i=0;i<count;i++) {
			String text = AllSugg.get(i).getText();
			System.out.println(text);
		}
			driver.quit();
	}

}
