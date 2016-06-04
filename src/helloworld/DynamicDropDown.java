package helloworld;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://spicejet.com/");
		//List<WebElement> list = driver.findElements(By.xpath("//input[@id ='ctl00_mainContent_ddl_originStation1_CTXT']"));
		//driver.findElement(By.xpath("//input[@id ='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//		System.out.println("The list size is :" + list.size());
//		WebElement element = list.get(0);
//		System.out.println("The Element name is :"+element.getTagName());
//				element.click();
		//driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Select dropown=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		
		dropown.selectByIndex(3);
		dropown.selectByValue("6 Adults");
		dropown.selectByValue("9");
		driver.close();
	}
}
