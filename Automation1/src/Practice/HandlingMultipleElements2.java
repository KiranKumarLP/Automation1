package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/xpath.html");
		List<WebElement> elements = driver.findElements(By.xpath("/input"));
		int count = elements.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = elements.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
