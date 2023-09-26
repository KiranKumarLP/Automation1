package DataDivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String usn = p.getProperty("username");
		String pwd = p.getProperty("password");
		System.out.println(url);
		System.out.println(usn);
		System.out.println(pwd);
	}
}
