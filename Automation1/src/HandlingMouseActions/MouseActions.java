package HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.vtiger.com/");
        WebElement target = driver.findElement(By.partialLinkText("Resources"));
        Actions a = new Actions(driver);
        a.moveToElement(target).perform();
        driver.findElement(By.partialLinkText("Customers")).click();
        WebElement trget = driver.findElement(By.id("loginspan"));
        a.doubleClick(trget).perform();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
	}

}
