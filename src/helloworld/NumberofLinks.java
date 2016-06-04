package helloworld;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NumberofLinks {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.ebay.com/");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("no. of links   "   +     allLinks.size());
		driver.close();

	}

}
