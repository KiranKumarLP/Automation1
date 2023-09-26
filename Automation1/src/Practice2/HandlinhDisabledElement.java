package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlinhDisabledElement {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.get("file:///C:/Users/user/OneDrive/Desktop/scrollbar.html");
       driver.findElement(By.id("d1")).sendKeys("admin");
       JavascriptExecutor j = (JavascriptExecutor) driver;
       j.executeScript("document.getElementById('d2').value='manager'");
       Thread.sleep(2500);
       j.executeScript("document.getElementById('d1').value=''");
       j.executeScript("document.getElementById('d2').value=''");
       
	}

}
