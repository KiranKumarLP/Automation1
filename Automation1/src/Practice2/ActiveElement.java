package Practice2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) {
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.google.com/");
           driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	}

}
