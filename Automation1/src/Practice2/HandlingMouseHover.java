package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		String phno = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/parent::div/child::p[2]")).getText();
		System.out.println(phno);
	}
}
