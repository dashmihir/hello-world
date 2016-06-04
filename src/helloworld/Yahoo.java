package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("games");
	String res=	driver.findElement(By.xpath("//li[@data-text='games for girls']")).getText();
		
		//String res=driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_18_0_4')]/div/ul/li[4]")).getText();
		//driver.get("http://gmail.com");
	//String res	=driver.findElement(By.xpath("//div[@class='banner']/h1")).getText();
	System.out.println(res);
	driver.close();
	}

}
