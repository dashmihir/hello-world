package helloworld;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaytmFrame {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		List <WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames  "+frames.size());
		/*for(int i=0;i<frames.size();i++)
		{
			driver.switchTo().frame(i);
			int s=driver.findElements(By.xpath("//input[@id='input_0']")).size();
			System.out.println(s);
			driver.switchTo().defaultContent();
		} */
		driver.switchTo().frame(2);	
driver.findElement(By.xpath("//input[@id='input_0']")).sendKeys("1223");
driver.switchTo().defaultContent();
		
	}

}
