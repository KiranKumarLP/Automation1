package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		
		int count = AllLinks.size();
		System.out.println(count);
		
		for(WebElement link:AllLinks){
			System.out.println(link.getText());  //for each loop
		}

		for(int i=0;i<count;i++){
			String text = AllLinks.get(i).getText();  //for loop
			System.out.println(text);
		}

		driver.quit();
	}
}
