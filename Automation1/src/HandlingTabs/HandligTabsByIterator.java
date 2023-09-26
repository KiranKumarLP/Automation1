package HandlingTabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandligTabsByIterator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Set<String> allWH = driver.getWindowHandles();
		Iterator<String> i = allWH.iterator();
		String pWH = i.next();
		String cWH = i.next();
		Thread.sleep(3000);
		driver.switchTo().window(cWH);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(pWH);
		driver.close();
	}
}
