package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://qaclickacademy.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("archanamishra2000@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ratnanjal");
		driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.id("u_0_n")).click();
	//	driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		driver.close();
	}

}
