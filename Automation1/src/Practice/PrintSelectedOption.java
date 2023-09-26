package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintSelectedOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Hotel.html");
		WebElement slv = driver.findElement(By.id("slv"));
		Select s = new Select(slv);
		List<WebElement> SelectedOption = s.getAllSelectedOptions();
		int count = SelectedOption.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = SelectedOption.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}
}
