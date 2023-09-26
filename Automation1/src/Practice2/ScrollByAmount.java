package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmount {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        int y = driver.findElement(By.xpath("//a[text()=' Future Planet ']")).getLocation().getY();
        Actions a = new Actions(driver);
        a.scrollByAmount(0,y);
	}

}
