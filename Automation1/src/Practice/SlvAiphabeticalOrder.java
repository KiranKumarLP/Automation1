package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlvAiphabeticalOrder {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Hotel.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s = new Select(slvlistbox);
		List<WebElement> AllOptions = s.getOptions();
		int count = AllOptions.size();
		System.out.println(count);
		List<String> al = new ArrayList();
		
		for(int i=0;i<count;i++)
		{
			String text = AllOptions.get(i).getText();
			al.add(text);
		}
		
		Collections.sort(al);
		
		for(String s1:al)
		{
			System.out.println(s1);
		}
		driver.quit();
		
	}

}
