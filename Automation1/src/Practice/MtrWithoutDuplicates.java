package Practice;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrWithoutDuplicates {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
        Select s = new Select(mtr);
        List<WebElement> AllOptions = s.getOptions();
        Set<String> set = new TreeSet();
        for(int i=0;i<AllOptions.size();i++)
        {
        	String text = AllOptions.get(i).getText();
        	set.add(text);
        }
        
        for(String s1:set)
        {
        	System.out.println(s1);
        }
        driver.quit();
	}

}
