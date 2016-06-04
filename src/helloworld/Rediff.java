package helloworld;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//	driver.get("http://shopping.rediff.com/?sc_cid=ushome_icon");
		driver.navigate().to("http://shopping.rediff.com/?sc_cid=ushome_icon");
		List<WebElement> allLinks=driver.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
		System.out.println("Total no. of links  " +allLinks.size());
		for(int i=0;i<allLinks.size();i++){
			System.out.println(allLinks.get(i).getText());
			allLinks.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			//driver.get("http://shopping.rediff.com/?sc_cid=ushome_icon");
			allLinks=driver.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
		
			
		}
		
		
		

	}

}
