package DataDivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTimeUsingPropertyFile {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String usn = p.getProperty("username");
		String pwd = p.getProperty("password");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
	}
}
