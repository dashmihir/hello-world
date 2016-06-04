package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {
	
	

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.amazon.com/");
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.cssSelector("#nav-link-yourAccount"));
		
		act.moveToElement(element).build().perform();
		WebElement abc=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		act.keyDown(Keys.SHIFT).moveToElement(abc).sendKeys("photo").build().perform();
		act.contextClick(abc).build().perform();
		//act.keyUp(Keys.SHIFT).moveToElement(abc).sendKeys("ASD").build().perform();
	}
}
		