package helloworld;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeSelenium {

	public static void main(String[] args) {
		//D:\drivers\selinium
	/*	System.setProperty("webdriver.chrome.driver","D:\\drivers\\selinium\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver(); */
		
		//MicrosoftWebDriver
		
		System.setProperty("webdriver.edge.driver","D:\\drivers\\selinium\\MicrosoftWebDriver.exe" );
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
	}
	
}
