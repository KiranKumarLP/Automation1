package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectandDeselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Hotel.html");
		WebElement mtelistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtelistbox);
		List<WebElement> AllOptions = s.getOptions();

		for(int i=0;i<AllOptions.size();i++){
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		s.deselectAll();
		driver.quit();
	}

}
