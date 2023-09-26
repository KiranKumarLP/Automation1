package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/user/OneDrive/Desktop/demo.html");
      driver.findElement(By.tagName("a")).click();
      Thread.sleep(2500);
      driver.navigate().back();
      driver.findElement(By.id("d1")).click();
      Thread.sleep(2500);
      driver.navigate().back();
      driver.findElement(By.name("n1")).click();
      Thread.sleep(2500);
      driver.navigate().back();
      driver.findElement(By.className("c1")).click();
      Thread.sleep(2500);
      driver.navigate().back();
      driver.findElement(By.linkText("Google")).click();
      Thread.sleep(2500);
      driver.navigate().back();
      driver.findElement(By.partialLinkText("Google")).click();
      Thread.sleep(2500);
      driver.navigate().back();
      driver.findElement(By.xpath("//a[text()='Google']")).click();
      Thread.sleep(2500);
      driver.findElement(By.xpath("//a[contains(text(),'Goo')]")).click();
      Thread.sleep(2500);
     // driver.close();
	}

}
