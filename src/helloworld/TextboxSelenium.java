package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextboxSelenium {
	public static void main(String[]args){
		WebDriver driver= new FirefoxDriver();
			
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("arcanamishra2000@gmail.com");
		//driver.findElement(By.cssSelector("input[id='Email'][name='Email']")).sendKeys("hello");
		
		//driver.findElement(By.cssSelector("input[id^='Emai']")).sendKeys("hello");
		//mail2334
		driver.findElement(By.cssSelector("input[id$= 'mail'] ")).sendKeys("hello");
	}

}
