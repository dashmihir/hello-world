package helloworld;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragging_dropping {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://jqueryui.com/droppable/");
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	driver.switchTo().frame(0);
	System.out.println(driver.findElement(By.xpath("//*[@id='droppable']/p")).getText());
	WebElement src=driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement dest=driver.findElement(By.xpath("//*[@id='droppable']"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(src,dest).build().perform();
	System.out.println(driver.findElement(By.xpath("//*[@id='droppable']/p")).getText());
	driver.switchTo().defaultContent();
	

	}

}
