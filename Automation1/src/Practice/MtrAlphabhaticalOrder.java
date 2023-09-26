package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrAlphabhaticalOrder {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement> allOption = s.getOptions();
		List<String> l = new ArrayList();
		
		for(int i=0;i<allOption.size();i++)
		{
			String text = allOption.get(i).getText();
			l.add(text);
		}
		
		Collections.sort(l);
		for(String s1:l)
		{
			System.out.println(s1);
		}
	}

}
