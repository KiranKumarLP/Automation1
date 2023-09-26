package Practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllMtrOptionInAlphabeticalnWithoutDuplicates {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/user/OneDrive/Desktop/Hotel.html");
        WebElement mtrlist = driver.findElement(By.id("mtr"));
        Select s = new Select(mtrlist);
        List<WebElement> allOption = s.getOptions();
        
        ArrayList<String> al = new ArrayList();
        TreeSet<String> ts = new TreeSet<String>();
        
        for(int i=0;i<allOption.size();i++) {
        	String text = allOption.get(i).getText();
        	al.add(text);
        	ts.add(text);
        }
        Collections.sort(al);
        System.out.println("All options in alphabetical order");
        for(int i=0;i<allOption.size();i++) {
        	System.out.println(al.get(i));
        }
        System.out.println("----------------------");
        System.out.println("All options without duplicates");
        for(String text:ts) {
        	System.out.println(text);
        }
        driver.quit();
    }
}
