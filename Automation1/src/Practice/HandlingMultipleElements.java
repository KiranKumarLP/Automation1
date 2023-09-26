package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/demo%20-%20Copy.html");
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int count = Links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = Links.get(i).getText();
			System.out.println(text);
		}
		driver.quit();

	}

}
