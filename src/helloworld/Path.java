package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Path {

	public static void main(String[] args) {
		
	WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	driver.get("http://facebook.com");
	String str=driver.findElement(By.xpath("//h2[@class='inlineBlock']")).getText();
	System.out.println(str);
	//driver.get("https://login.salesforce.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("archana");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	driver.close();
	//driver.findElement(By.cssSelector("input[ id='username']")).sendKeys("asddf");
	//driver.findElement(By.cssSelector("input[ id='password']")).sendKeys("fdsgdfs");
	//driver.findElement(By.xpath("//input[@ id='Login']")).click();
	//driver.close();
	
	}

}
