package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproUrl {

	public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/");
         driver.findElement(By.id("APjFqb")).sendKeys("Wiprojobs",Keys.ENTER);
         List<WebElement> allUrl = driver.findElements(By.xpath("//a"));
         int count = allUrl.size();
         System.out.println(count);
         
         for(int i=0;i<count;i++) {
        	 String text = allUrl.get(i).getAttribute("href");
        	 System.out.println(text);
         }
         
         System.out.println("-------------------");
         
         for(WebElement url:allUrl) {
        	 System.out.println(url.getAttribute("href"));
         }
	}

}
