package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		 for(int i=0;i<allLinks.size();i++) {
			 String text = allLinks.get(i).getText();
			 System.out.println(text);
		 }
		 
		 
		 for(WebElement link:allLinks) {
			System.out.println(link.getText());
		}
		driver.quit();
	
	}
}
