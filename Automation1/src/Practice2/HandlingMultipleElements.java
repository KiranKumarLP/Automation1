package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/demo.html");
		List<WebElement> allLinks = driver.findElements(By.id("d1"));
		int count = allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = allLinks.get(i).getText();
			System.out.println(text);
		}
		
		System.out.println("-------------------");
		
		for(WebElement s:allLinks) {
			System.out.println(s.getText());
		}
		//driver.close();
	}
}
