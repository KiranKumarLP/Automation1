package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionInMtr {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		List<WebElement> mtrOption = s.getOptions();
		int count = mtrOption.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = mtrOption.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
