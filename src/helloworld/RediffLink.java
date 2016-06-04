package helloworld;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffLink {

	public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
    driver.get("http://www.rediff.com/");
    driver.findElement(By.xpath("//*[@id='homewrapper']/div[5]/a[4]/div/u")).click();
   // driver.findElement(By.xpath("//div[@id='popular_cat']"))
   WebElement box= driver.findElement(By.xpath("//div[@id='popular_cat']"));
   List<WebElement> links=box.findElements(By.tagName("a"));
   System.out.println("total links  " +links.size());
   for(int i=0;i<links.size();i++){
	   System.out.println(links.get(i).getText());
	   links.get(i).click();
	   System.out.println(driver.getTitle());
   }
   
   
   
    driver.close();

	}

}
